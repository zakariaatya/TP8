package ma.cigma.tp8.service;

import ma.cigma.tp8.dao.IFactureDao;
import ma.cigma.tp8.models.Facture;

import java.util.List;

public class FactureServiceImpl implements IFactureService{

    private IFactureDao dao;

    public void setDao(IFactureDao dao) {
        this.dao = dao;
    }

    @Override
    public Facture save(Facture f) {
        return dao.save(f);
    }

    @Override
    public Facture modify(Facture f) {
        return dao.update(f);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Facture> getAll() {
        return null;
    }

}
