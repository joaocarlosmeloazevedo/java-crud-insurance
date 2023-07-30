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

	@Autowired
	private SeguradoRepository seguradoRepository;
	
	@GetMapping
	public ResponseEntity<List<Segurado>> findAll(){
		List<Segurado> list = seguradoRepository.findAll();
		//List<Segurado> list = new ArrayList<>();
		//list.add(new Segurado(1L, "Joao Carlos"));
		//list.add(new Segurado(2L, "Gustavo Moreira"));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Segurado> findByID(@PathVariable Long id){
		Segurado seg = seguradoRepository.findById(id);
		//Segurado seg = new Segurado(1L, "JC Carlos");
		return ResponseEntity.ok().body(seg);
	}
}
