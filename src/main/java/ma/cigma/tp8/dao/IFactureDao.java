package ma.cigma.tp8.dao;


import ma.cigma.tp8.models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFactureDao extends CrudRepository<Facture,Long> {
    List<Facture> findByDescription (String description);
}
