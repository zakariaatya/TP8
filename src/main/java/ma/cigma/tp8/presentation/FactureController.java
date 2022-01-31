package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Facture;
import ma.cigma.tp8.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FactureController {
    @Autowired
    private IFactureService service;

    public void setService(IFactureService service)
    {
        this.service=service;
    }
    public void save(Facture f)
    {
        service.save(f);
    }
    public void modify(Facture f)
    {
        service.modify(f);
    }
    public void removeById(long id)
    {
        service.removeById(id);
    }
    public Facture getById(long id)
    {
        return service.getById(id);
    }
    public List<Facture> getAll()
    {
        return service.getAll();
    }
}
