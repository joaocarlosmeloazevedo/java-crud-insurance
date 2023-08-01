//CLASSE QUE DEFINE O OBJETO
//SEGURADO - Nome e CPF ou CNPJ

package br.com.neutron.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Segurado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String cpfCnpj;
	
	//private List<Sinistro> sinistros = new ArrayList<>();
	
	public Segurado() {
		
	}

	//public List<Sinistro> getSinistros() {
	//	return sinistros;
	//}

	//public void setSinistros(List<Sinistro> sinistros) {
	//	this.sinistros = sinistros;
	//}

	public Segurado(Long id, String nome, String cpfCnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segurado other = (Segurado) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
