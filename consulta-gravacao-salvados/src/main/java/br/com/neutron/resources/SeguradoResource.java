package br.com.neutron.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neutron.entity.Segurado;
import br.com.neutron.repositories.SeguradoRepository;

@RestController
@RequestMapping(value = "/segurado")
public class SeguradoResource {

	@Autowired /* Creating a dependency of my Repository Class */
	private SeguradoRepository seguradoRepository;
	
	/* ResponseEntity = Requesting with a set of Parameters (An entire List in this case).
	  				    Returning, if possible, an "OK" HTTP Response passing the List inside the body. */
	
	@GetMapping /* Saying to Java that is a GET Method */
	public ResponseEntity<List<Segurado>> findAll(){
		
		/* Instanciando  */
		List<Segurado> list = seguradoRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	/* Returning just the Segurado by ID, and passing his ID inside the body*/
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Segurado> findByID(@PathVariable Long id){
		Segurado seg = seguradoRepository.findById(id);
		
		return ResponseEntity.ok().body(seg);
	}
}
