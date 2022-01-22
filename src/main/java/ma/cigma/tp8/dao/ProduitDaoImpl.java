package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProduitDaoImpl implements IProduitDao{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_produits");
    EntityManager em = emf.createEntityManager();

    @Override
    public Produit save(Produit p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Produit update(Produit p) {
        em.getTransaction().begin();
        Produit currentProduit = em.find(Produit.class,p.getId());
        currentProduit.getNom(p.getNom());
        currentProduit.getPrice(p.getPrice(p.getPrice()));
        em.persist(currentProduit);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idProduit) {
        em.getTransaction().begin();
        Produit produitInDataBase = em.find(Produit.class,idProduit);
        em.remove(produitInDataBase);
        em.getTransaction().commit();

    }

    @Override
    public Produit findById(long idProduit) {
        return em.find(Produit.class,idProduit);
    }

    @Override
    public List<Produit> findAll() {
        return null;
    }
}
