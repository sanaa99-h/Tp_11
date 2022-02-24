package ma.cigma.Dao;

import ma.cigma.Models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientDao extends CrudRepository<Client,Long> {
    List<Client> findByName(String name);
// Name est un attribut dans la classe Client


    Client save(Client c);
}

