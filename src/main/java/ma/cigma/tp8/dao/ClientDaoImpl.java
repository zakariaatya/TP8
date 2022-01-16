package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientDaoImpl implements IClientDao
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    @Override
    public Client save(Client c)
    {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client update(Client newClient) {
        em.getTransaction().begin();
        Client currentClient=em.find(Client.class,newClient.getId());
        currentClient.setNom(newClient.getNom());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idClient)
    {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Client findById(long idClient)
    {
        return em.find(Client.class,idClient);
    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}
