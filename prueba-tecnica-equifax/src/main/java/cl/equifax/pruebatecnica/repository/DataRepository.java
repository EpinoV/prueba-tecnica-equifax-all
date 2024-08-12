package cl.equifax.pruebatecnica.repository;

import cl.equifax.pruebatecnica.model.Data;
import cl.equifax.pruebatecnica.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {
}
