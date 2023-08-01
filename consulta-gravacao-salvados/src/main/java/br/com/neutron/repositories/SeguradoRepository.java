package br.com.neutron.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.neutron.entity.Segurado;

@Component //
public class SeguradoRepository {
	
	private Map<Long, Segurado> map = new HashMap <>(); //Dictionary;
	
	public void save(Segurado obj) {
		map.put(obj.getId(), obj);
	}
	
	public Segurado findById(Long id) {
		return map.get(id);
	}
	
	public List<Segurado> findAll(){
		return new ArrayList<Segurado>(map.values());
	}
	
	
}
