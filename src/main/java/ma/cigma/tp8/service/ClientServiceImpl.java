package ma.cigma.tp8.service;

import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.dao.IClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService
{
    @Autowired
    private IClientDao dao;

    @Override
    @Transactional
    public Client save(Client c)
    {
        return dao.save(c);
    }

    @Override
    @Transactional
    public Client modify(Client c)
    {
        Client old=dao.findById(c.getId()).get();
        old.setNom(c.getNom());
        return dao.save(old);
    }

    @Override
    @Transactional
    public void removeById(long id)
    {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id)
    {
        return dao.findById(id).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) dao.findAll();
    }

    @Override
    public Client getOne(long id) {
        return dao.findById(id).get();
    }
}
