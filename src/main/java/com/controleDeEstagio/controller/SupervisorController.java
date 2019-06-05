package com.controleDeEstagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controleDeEstagio.models.Supervisor;
import com.controleDeEstagio.repository.SupervisorRepository;

@Controller
public class SupervisorController {
	@Autowired
	private SupervisorRepository er;
	
	@RequestMapping(value="/cadastroSupervisor", method=RequestMethod.GET)
	public String form(){
		//verificar se o usuario está cadastrado. sim, direciona para a pagina do usuario. não, retorna parao login
		return "evento/cadastroSupervisor";
	}
	
	@RequestMapping(value="/cadastroSupervisor", method=RequestMethod.POST)
	public String form(Supervisor supervisor){
		er.save(supervisor);
		return "redirect:/";
		}
		

}
