package ma.cigma.tp8.service;

import ma.cigma.tp8.models.Produit;

import java.util.List;

public interface IPromotionService {

    Produit save(Produit p);
    Produit modify(Produit p);
    void removeById(long id);
    Produit getById(long id);
    List<Produit>getAll();
}
