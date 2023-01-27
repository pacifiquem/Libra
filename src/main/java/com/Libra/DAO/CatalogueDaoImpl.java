package com.Libra.DAO;
import com.Libra.orm.Catalogue;
import java.util.List;

public class CatalogueDaoImpl extends DAO implements CatalogueDAO {


//(String title, String author, String
// ISBN, String publisher, Date publicationDate,
// int edition, String subject,
// String description, int numberOfCopies,
// int availableCopies) {
// this.title = title;

//public Catalogue get(int id) throws SQLException(){



    public void addCatalogue(Catalogue catalogue) {
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
    public Catalogue getCatalogueById(int id) {
        return null;
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

    }


    @Override
    public List<Catalogue> getAllCatalogues() {
        return null;
    }
}