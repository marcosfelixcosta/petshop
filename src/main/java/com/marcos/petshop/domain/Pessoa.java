package com.marcos.petshop.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String CodNacional;
	
	@ElementCollection
	@CollectionTable(name = "TELEFONE", joinColumns = @JoinColumn(name = "id_pessoa"))
	private Set<String> telefones = new HashSet<>();
	
	private List<Endereco> endereco = new ArrayList<>();


	
	public Pessoa() {
		
		
		
	}


	public Pessoa(Integer id, String nome, String email, String codNacional) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		CodNacional = codNacional;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCodNacional() {
		return CodNacional;
	}


	public void setCodNacional(String codNacional) {
		CodNacional = codNacional;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}


	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}


	public Set<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
}
