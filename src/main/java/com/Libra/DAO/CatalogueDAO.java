package com.Libra.DAO;

import com.Libra.orm.Catalogue;

import java.util.List;

public interface CatalogueDAO {
    public void addCatalogue(Catalogue catalogue);
    public Catalogue getCatalogueById(int id);

    public void updateCatalogue(Catalogue catalogue);

    public void deleteCatalogue(int id);
//    public void insertCatalogue(Catalogue catalogue);


    public List<Catalogue>getAllCatalogues();

}
