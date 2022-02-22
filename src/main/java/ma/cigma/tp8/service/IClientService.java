package ma.cigma.tp8.service;

import ma.cigma.tp8.models.Client;

import java.util.List;

public interface IClientService
{

    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
    List<Client> getAll();

    Client getOne(long id);
}
