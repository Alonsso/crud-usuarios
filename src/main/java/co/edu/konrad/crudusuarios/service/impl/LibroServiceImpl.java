package co.edu.konrad.crudusuarios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import co.edu.konrad.crudusuarios.commons.GenericServiceImpl;
import co.edu.konrad.crudusuarios.model.Libro;
import co.edu.konrad.crudusuarios.repository.LibroRepository;
import co.edu.konrad.crudusuarios.service.api.LibroServiceAPI;


@Service
public class LibroServiceImpl extends GenericServiceImpl<Libro,	Long> implements LibroServiceAPI{
	
	@Autowired
	private LibroRepository libroDaoAPI;
	
	@Override
	public CrudRepository<Libro, Long> getDao() {
		// TODO Auto-generated method stub
		return libroDaoAPI;
	}
}