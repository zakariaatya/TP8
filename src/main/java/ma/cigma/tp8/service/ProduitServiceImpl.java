package ma.cigma.tp8.service;

import ma.cigma.tp8.dao.IProduitDao;
import ma.cigma.tp8.models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService{
    @Autowired
    private IProduitDao dao;


    @Override
    @Transactional
    public Produit save(Produit p)
    {
        return dao.save(p);
    }

    @Override
    @Transactional
    public Produit modify(Produit p)
    {
        Produit old=dao.findById(p.getId()).get();
        old.setNom(p.getNom());
        old.setPrice(p.getPrice());
        return dao.save(old);
    }

    @Override
    @Transactional
    public void removeById(long id){ dao.deleteById(id);}


    @Override
    public Produit getById(long id){return dao.findById(id).get();}

    @Override
    public List<Produit> getAll()
    {
        return (List<Produit>) dao.findAll();
    }
}
