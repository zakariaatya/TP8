package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Facture;
import ma.cigma.tp8.service.IFactureService;

public class FactureController {

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
    void getAll(){}
}
