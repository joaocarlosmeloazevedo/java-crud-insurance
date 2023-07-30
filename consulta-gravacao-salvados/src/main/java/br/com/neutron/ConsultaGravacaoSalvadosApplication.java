package br.com.neutron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.neutron.entity.Segurado;
import br.com.neutron.repositories.SeguradoRepository;

@SpringBootApplication
public class ConsultaGravacaoSalvadosApplication implements CommandLineRunner{
	
	@Autowired
	private SeguradoRepository seguradoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultaGravacaoSalvadosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Segurado seg1 = new Segurado(1L, "JC");
		Segurado seg2 = new Segurado(2L, "MA");
		
		seguradoRepository.save(seg1);
		seguradoRepository.save(seg2);
	}

}
