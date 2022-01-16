package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.service.IClientService;

public class ClientController
{
    private IClientService service;

    public ClientController(IClientService service) {
        this.service = service;
    }

    public void setService(IClientService service)
    {
        this.service=service;
    }
    public void save(Client c)
    {
        service.save(c);
    }
    public void modify(Client c)
    {
        service.modify(c);
    }
    public void removeById(long id)
    {
        service.removeById(id);
    }
    public Client getById(long id)
    {
        return service.getById(id);
    }
    void getAll(){}

}
