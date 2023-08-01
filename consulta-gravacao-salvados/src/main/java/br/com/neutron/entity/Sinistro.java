package br.com.neutron.entity;

import java.io.Serializable;
import java.util.Objects;

public class Sinistro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numeroSinistro;
	private Double valorSinistro;
	private String dataAviso;
	private String tipoSinistro;
	private Segurado segurado;

	public Sinistro () {}

	public Sinistro(Long id, String numeroSinistro, Double valorSinistro, String dataAviso, String tipoSinistro, Segurado segurado) {
		super();
		this.id = id;
		this.numeroSinistro = numeroSinistro;
		this.valorSinistro = valorSinistro;
		this.dataAviso = dataAviso;
		this.tipoSinistro = tipoSinistro;
		this.segurado = segurado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroSinistro() {
		return numeroSinistro;
	}

	public void setNumeroSinistro(String numeroSinistro) {
		this.numeroSinistro = numeroSinistro;
	}

	public Double getValorSinistro() {
		return valorSinistro;
	}

	public Segurado getSegurado() {
		return segurado;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}

	public void setValorSinistro(Double valorSinistro) {
		this.valorSinistro = valorSinistro;
	}

	public String getDataAviso() {
		return dataAviso;
	}

	public void setDataAviso(String dataAviso) {
		this.dataAviso = dataAviso;
	}

	public String getTipoSinistro() {
		return tipoSinistro;
	}

	public void setTipoSinistro(String tipoSinistro) {
		this.tipoSinistro = tipoSinistro;
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
		Sinistro other = (Sinistro) obj;
		return Objects.equals(id, other.id);
	}
	
	


}
