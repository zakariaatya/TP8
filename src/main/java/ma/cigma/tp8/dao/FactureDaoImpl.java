package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class FactureDaoImpl implements IFactureDao{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em = emf.createEntityManager();

    @Override
    public Facture save(Facture f)
    {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture newFacture)
    {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,newFacture.getId());
        currentFacture.setAmount(newFacture.getAmount());
        currentFacture.setDescription(newFacture.getDescription());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture factureInDataBase = em.find(Facture.class,idFacture);
        em.remove(factureInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Facture findById(long idFacture) {
        return em.find(Facture.class,idFacture);
    }

    @Override
    public List<Facture> findAll() {
        return null;
    }


}
