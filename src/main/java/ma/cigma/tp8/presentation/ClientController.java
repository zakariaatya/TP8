package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("ctrl1")
public class ClientController
{
    @Autowired
    private IClientService service;


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
    public List<Client> getAll(){
        return service.getAll();
    }

}
