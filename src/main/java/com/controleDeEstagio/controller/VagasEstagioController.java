package com.controleDeEstagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controleDeEstagio.models.VagasEstagio;
import com.controleDeEstagio.repository.VagasEstagioRepository;

@Controller
public class VagasEstagioController {
	@Autowired
	private VagasEstagioRepository er;
	
	@RequestMapping(value="/cadastroVagasEstagio", method=RequestMethod.GET)
	public String form(){
		//verificar se o usuario está cadastrado. sim, direciona para a pagina do usuario. não, retorna parao login
		return "evento/cadastroVagasEstagio";
	}
	
	@RequestMapping(value="/cadastroVagasEstagio", method=RequestMethod.POST)
	public String form(VagasEstagio vagasEstagio){
		er.save(vagasEstagio);
		return "redirect:/";
		}
}
