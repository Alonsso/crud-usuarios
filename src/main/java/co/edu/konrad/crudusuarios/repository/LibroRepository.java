package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.konrad.crudusuarios.model.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro,Long>{

}