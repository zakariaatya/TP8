package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController
{
    @Autowired
    private IClientService service;

    @PostMapping("/create")
    public Client save(@RequestBody Client c)
    {
        return service.save(c);
    }

    @PutMapping("/update")
    public Client modify(@RequestBody Client c)
    {
        return service.modify(c);
    }

    public void removeById(long id)
    {
        service.removeById(id);
    }
    public Client getById(long id)
    {
        return service.getById(id);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id)
    {
        return service.getOne(id);
    }

    @GetMapping("/all")
    public List<Client> getAll()
    {
        return service.getAll();
    }

}
