package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Client;

import java.util.List;

public interface IClientDao {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
    List<Client>findAll();
}
