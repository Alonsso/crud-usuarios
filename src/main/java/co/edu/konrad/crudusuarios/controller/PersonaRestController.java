package co.edu.konrad.crudusuarios.controller;
import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.service.api.PersonaServiceAPI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/api")
public class PersonaRestController {
    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @GetMapping(value = "/getAll")

    public List<Persona> getAll(){
        return personaServiceAPI.getAll();
    }

    @PostMapping(value = "/savePersona")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        Persona objeto = personaServiceAPI.save(persona);
        return new ResponseEntity<Persona>(objeto, HttpStatus.OK);
    }

    @GetMapping(value = "/deletePersona/{id}")

    public ResponseEntity<Persona> delete(@PathVariable Long id){
        Persona persona = personaServiceAPI.get(id);
        if (persona != null){
            personaServiceAPI.delete(id);
        }else{
            return new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }
}
