package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
    List<Client> findByNom (String nom);
}
