package com.controleDeEstagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.controleDeEstagio.models.Empresa;
import com.controleDeEstagio.repository.EmpresaRepository;

@Controller
public class EmpresaController {	
	@Autowired
	private EmpresaRepository er;
	
	@RequestMapping(value="/cadastroEmpresa", method=RequestMethod.GET)
	public String form(){
		//verificar se o usuario está cadastrado. sim, direciona para a pagina do usuario. não, retorna parao login
		return "evento/cadastroEmpresa";
	}
	
	@RequestMapping(value="/cadastroEmpresa", method=RequestMethod.POST)
	public String form(Empresa empresa){
		er.save(empresa);
		return "redirect:/";
		}
	
}
