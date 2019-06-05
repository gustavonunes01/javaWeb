package com.controleDeEstagio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VagasEstagio implements Serializable{
	private static final long serialVersionUID = 1L; 	//gera um Id auto increment
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;//codigo sequencial para o banco
	private String descricao;
	private String requisitosObrigatorios;
	private String requisitosDesejaveis;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRequisitosObrigatorios() {
		return requisitosObrigatorios;
	}
	public void setRequisitosObrigatorios(String requisitosObrigatorios) {
		this.requisitosObrigatorios = requisitosObrigatorios;
	}
	public String getRequisitosDesejaveis() {
		return requisitosDesejaveis;
	}
	public void setRequisitosDesejaveis(String requisitosDesejaveis) {
		this.requisitosDesejaveis = requisitosDesejaveis;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
