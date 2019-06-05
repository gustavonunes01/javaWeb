package com.controleDeEstagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controleDeEstagio.models.RelatorioEstagio;
import com.controleDeEstagio.repository.RelatorioEstagioRepository;

@Controller
public class RelatorioEstagioController {
	
	@Autowired
	private RelatorioEstagioRepository er;

	@RequestMapping(value="/cadastroRelatorioEstagio", method=RequestMethod.GET)
	public String form(){
		//verificar se o usuario está cadastrado. sim, direciona para a pagina do usuario. não, retorna parao login
		return "evento/cadastroRelatorioEstagio";
	}
	
	@RequestMapping(value="/cadastroRelatorioEstagio", method=RequestMethod.POST)
	public String form(RelatorioEstagio relatorioEstagio){
		er.save(relatorioEstagio);
		return "redirect:/";
		}
}
