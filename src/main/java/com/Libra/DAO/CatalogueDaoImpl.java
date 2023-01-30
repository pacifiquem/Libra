package com.Libra.DAO;
import com.Libra.orm.Catalogue;
import com.Libra.orm.Patron;
import org.hibernate.Query;

import java.util.List;
import java.util.Optional;

public class CatalogueDaoImpl extends DAO implements CatalogueDAO {


//(String title, String author, String
// ISBN, String publisher, Date publicationDate,
// int edition, String subject,
// String description, int numberOfCopies,
// int availableCopies) {
// this.title = title;

//public Catalogue get(int id) throws SQLException(){



    public void addCatalogue(Catalogue catalogue) {
        try{
            begin();
            getSession().saveOrUpdate(catalogue);
            commit();
        } catch (Exception e) {
            rollback();
        }

    }

    @Override
    public Optional <Catalogue> getCatalogueById(int id) {
        try {
            begin();
            Catalogue catalogue = (Catalogue) getSession().get(Catalogue.class, id);
            return Optional.ofNullable(catalogue);
        } catch (Exception e) {
            rollback();
            return null;
        }
    }

    public void updateCatalogue(Catalogue catalogue) {
        try {
            begin();
            getSession().save(catalogue);
            commit();
            close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCatalogue(int id) {
        Catalogue catalogue = null;
        try{
            begin();
            catalogue = (Catalogue) getSession().get(Catalogue.class, id);
            getSession().delete(catalogue);
        }catch(Exception e){
            rollback();
        }
    }


    @Override
    public List<Catalogue> getAllCatalogues() {
        try{
            begin();
            Query query = getSession().createQuery("from catalogue");
            List <Catalogue> books = query.list();
            commit();
            return books;
        }catch(Exception e){
            rollback();
            return null;
        }
    }
}