package com.spring.banco.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity 
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String marca; 
	private String nome; 
	private int ano; 
	private String cor; 

	public Carro() {
		super();
	}

	
	public Carro(Long id, String marca, String nome, int ano, String cor) {
		super();
		this.id = id;
		this.marca = marca;
		this.nome = nome;
		this.ano = ano;
		this.cor = cor;
	}

	// Getters e Setters para todos os campos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(ano, cor, id, marca, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return ano == other.ano && Objects.equals(cor, other.cor) && Objects.equals(id, other.id)
				&& Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", nome=" + nome + ", ano=" + ano + ", cor=" + cor + "]";
	}
}
