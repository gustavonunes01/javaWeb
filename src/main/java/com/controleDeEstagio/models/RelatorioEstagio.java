package com.controleDeEstagio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RelatorioEstagio implements Serializable{
	
	private static final long serialVersionUID = 1L; //gera um Id auto increment
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;//codigo sequencial para o banco
	private String ra;
	private String nomeAluno;
	private String nomeEmpresa;
	private String data;
	private String atividade1;
	private String atividade2;
	private String atividade3;
	public long getCodigo() {
		return codigo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAtividade1() {
		return atividade1;
	}
	public void setAtividade1(String atividade1) {
		this.atividade1 = atividade1;
	}
	public String getAtividade2() {
		return atividade2;
	}
	public void setAtividade2(String atividade2) {
		this.atividade2 = atividade2;
	}
	public String getAtividade3() {
		return atividade3;
	}
	public void setAtividade3(String atividade3) {
		this.atividade3 = atividade3;
	}
}
