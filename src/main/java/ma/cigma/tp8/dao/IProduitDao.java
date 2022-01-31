package ma.cigma.tp8.dao;

import ma.cigma.tp8.models.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduitDao extends CrudRepository<Produit,Long> {

}
