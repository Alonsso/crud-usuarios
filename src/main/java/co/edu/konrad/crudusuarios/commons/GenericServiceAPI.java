package co.edu.konrad.crudusuarios.commons;

import java.io.Serializable;
import java.util.List;
 
/**
 * GenericServiceAPI
 */
public interface GenericServiceAPI <T, ID extends Serializable>  {
	T save(T entity);
	void delete (ID id);
	T get(ID id);
	List<T> getAll();
}
