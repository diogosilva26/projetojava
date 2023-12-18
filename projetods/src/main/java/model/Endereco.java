package model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_endereco;
	private String cep;
	private String rua;
	private String numero;
	private String bairro;
	private String estado;

	public Endereco() {
    }
	
	public Endereco(Integer id_endereco, String cep, String rua, String numero, String bairro, String estado) {
		super();
		this.id_endereco = id_endereco;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}

	public Integer getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "\nCEP: " + cep + "\nRua: " + rua + "\nBairro: " + bairro + "\nEstado: " + estado;
	}

}
