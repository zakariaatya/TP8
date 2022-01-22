package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Produit;

import java.util.List;

public interface IProduitDao {

    Produit save(Produit p);
    Produit update(Produit p);
    void deleteById(long ifProduit);
    Produit findById(long idProduit);
    List<Produit> findAll();
}
