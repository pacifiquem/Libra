package com.Libra.orm.dao;

import com.Libra.orm.Catalogue;
import com.Libra.orm.Patron;

import java.util.List;

public interface CirculationDAO {
    public List<Patron> getAllLenders();
    //id, name, id book lent, fine charged
    public List<Catalogue> getLentBooks();
    //book id, book name, id lent patron, dates
}
