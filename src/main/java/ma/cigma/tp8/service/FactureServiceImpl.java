package ma.cigma.tp8.service;

import ma.cigma.tp8.dao.IFactureDao;
import ma.cigma.tp8.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FactureServiceImpl implements IFactureService{
    @Autowired
    private IFactureDao dao;

    @Override
    @Transactional
    public Facture save(Facture f) {
        return dao.save(f);
    }

    @Override
    @Transactional
    public Facture modify(Facture f) {
        Facture old=dao.findById(f.getId()).get();
        old.setAmount(f.getAmount());
        old.setDescription(f.getDescription());
        return dao.save(old);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Facture> getAll() {
        return (List<Facture>) dao.findAll();
    }

}
