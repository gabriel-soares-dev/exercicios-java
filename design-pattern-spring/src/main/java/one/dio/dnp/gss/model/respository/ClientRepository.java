package one.dio.dnp.gss.model.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.dio.dnp.gss.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
