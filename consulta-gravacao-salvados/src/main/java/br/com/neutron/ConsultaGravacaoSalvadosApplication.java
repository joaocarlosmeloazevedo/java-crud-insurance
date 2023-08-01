package br.com.neutron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.neutron.entity.Segurado;
import br.com.neutron.entity.Sinistro;
import br.com.neutron.repositories.SeguradoRepository;
import br.com.neutron.repositories.SinistroRepository;

@SpringBootApplication
public class ConsultaGravacaoSalvadosApplication implements CommandLineRunner{
															/*  */
	@Autowired
	private SeguradoRepository seguradoRepository;
	
	@Autowired
	private SinistroRepository sinistroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultaGravacaoSalvadosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Segurado seg1 = new Segurado(1L, "João Carlos", "43331597848");
		Segurado seg2 = new Segurado(2L, "Marcella Cauzin", "33451387984");
		
		Sinistro sin1 = new Sinistro(1L, "58.36.325486",4500.86,"01/08/2023","Seguro de Moto", seg1);
		Sinistro sin2 = new Sinistro(2L, "47.25.416377",3234.98,"31/07/2023","Seguro de Auto", seg2);
		
		seguradoRepository.save(seg1);
		seguradoRepository.save(seg2);
		
		sinistroRepository.save(sin1);
		sinistroRepository.save(sin2);
	}

}
