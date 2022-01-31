package ma.cigma.tp8.presentation;

import ma.cigma.tp8.models.Produit;
import ma.cigma.tp8.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private IProduitService servie;

    public void setServie(IProduitService servie) {this.servie=servie;}
    public void save(Produit p)
    {
        servie.save(p);
    }
    public void modify(Produit p)
    {
        servie.modify(p);
    }
    public void removeById(long id)
    {
        servie.removeById(id);
    }
    public Produit getById(long id)
    {
        return servie.getById(id);
    }
    public List<Produit> getAll()
    {
        return servie.getAll();
    }
}
