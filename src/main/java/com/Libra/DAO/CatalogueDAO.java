package com.Libra.DAO;

import com.Libra.orm.Catalogue;

import java.util.List;
import java.util.Optional;

public interface CatalogueDAO {
    public void addCatalogue(Catalogue catalogue);
    public Optional <Catalogue> getCatalogueById(int id);

    public void updateCatalogue(Catalogue catalogue);

    public void deleteCatalogue(int id);

    public List<Catalogue>getAllCatalogues();

}
