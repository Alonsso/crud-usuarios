package co.edu.konrad.crudusuarios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import co.edu.konrad.crudusuarios.commons.GenericServiceImpl;
import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.repository.PersonaRespository;
import co.edu.konrad.crudusuarios.service.api.PersonaServiceAPI;


@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona,	Long> implements PersonaServiceAPI{
	
	@Autowired
	private PersonaRespository personaDaoAPI;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return personaDaoAPI;
	}
}
