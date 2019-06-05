package com.controleDeEstagio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supervisor implements Serializable {	
	private static final long serialVersionUID = 1L; 	//gera um Id auto increment
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;//codigo sequencial para o banco
	private String ra;
	private String nome;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
