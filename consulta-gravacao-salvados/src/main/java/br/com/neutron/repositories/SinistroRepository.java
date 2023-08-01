package br.com.neutron.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.neutron.entity.Sinistro;

/* Annotation to create an object of this class on Entities Resource */
@Component 
public class SinistroRepository {
	
	/* Dictionary KEY:VALUE */
	private Map<Long, Sinistro> map = new HashMap <>(); 
	
	public void save(Sinistro obj) {
		map.put(obj.getId(), obj);
	}
	
	public Sinistro findById(Long id) {
		return map.get(id);
	}
	
	public List<Sinistro> findAll(){
		return new ArrayList<Sinistro>(map.values());
	}
	
	
}
