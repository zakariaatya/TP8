package ma.cigma.tp8.service;

import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.dao.IClientDao;

import java.util.List;

public class ClientServiceImpl implements IClientService
{
    private IClientDao dao;

    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
    }

    public void setDao(IClientDao dao)
    {
        this.dao=dao;
    }

    @Override
    public Client save(Client c)
    {
        return dao.save(c);
    }

    @Override
    public Client modify(Client c)
    {
        return dao.update(c);
    }

    @Override
    public void removeById(long id)
    {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return null;
    }
}
