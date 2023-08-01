package br.com.neutron.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neutron.entity.Sinistro;
import br.com.neutron.repositories.SinistroRepository;

@RestController
@RequestMapping(value = "/sinistros")
public class SinistroResource {

	@Autowired /* Creating a dependency of my Repository Class */
	private SinistroRepository SinistroRepository;
	
	/* ResponseEntity = Requesting with a set of Parameters (An entire List in this case).
	  				    Returning, if possible, an "OK" HTTP Response passing the List inside the body. */
	
	@GetMapping /* Saying to Java that is a GET Method */
	public ResponseEntity<List<Sinistro>> findAll(){
		
		/* Instanciando  */
		List<Sinistro> list = SinistroRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	/* Returning just the Sinistro by ID, and passing his ID inside the body*/
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Sinistro> findByID(@PathVariable Long id){
		Sinistro seg = SinistroRepository.findById(id);
		
		return ResponseEntity.ok().body(seg);
	}
}
