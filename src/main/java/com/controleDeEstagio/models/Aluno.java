package com.controleDeEstagio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L; 	//gera um Id auto increment
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;//codigo sequencial para o banco
	private String  cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	private String ra;
	private String nome;
	private String sobrenome;
	private String curso;
	private String anoDoCurso;
	private String termino;
	private String habilidade;
	private String sobreVoce;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
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
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getAnoDoCurso() {
		return anoDoCurso;
	}
	public void setAnoDoCurso(String anoDoCurso) {
		this.anoDoCurso = anoDoCurso;
	}
	public String getTermino() {
		return termino;
	}
	public void setTermino(String termino) {
		this.termino = termino;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public String getSobreVoce() {
		return sobreVoce;
	}
	public void setSobreVoce(String sobreVoce) {
		this.sobreVoce = sobreVoce;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
