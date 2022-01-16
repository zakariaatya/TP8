package ma.cigma.tp8.service;

import ma.cigma.tp8.models.Facture;

import java.util.List;

public interface IFactureService {


    Facture save(Facture f);
    Facture modify(Facture f);
    void removeById(long id);
    Facture getById(long id);
    List<Facture>getAll();
}
