package ma.cigma.tp8.dao;


import ma.cigma.tp8.models.Facture;

import java.util.List;

public interface IFactureDao {

    Facture save(Facture f);
    Facture update(Facture f);
    void deleteById(long idFacture);
    Facture findById(long idFacture);
    List<Facture>findAll();
}
