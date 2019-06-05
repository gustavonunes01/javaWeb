package com.controleDeEstagio.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.controleDeEstagio.models.Aluno;
import com.controleDeEstagio.models.Usuario;
import com.controleDeEstagio.repository.AlunoRepository;
import com.controleDeEstagio.repository.UsuarioRepository;


@Controller
public class AdminController {

	@Autowired
	private AlunoRepository er;
	private Usuario user;
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	
	@RequestMapping(value="/indexAdmin", method=RequestMethod.GET)
	public String form(){
		//verificar se o usuario está cadastrado. sim, direciona para a pagina do usuario. não, retorna parao login
		return "evento/indexAdmin";
	}
	
	@RequestMapping("/alunos")
	public ModelAndView listaAlunos(Principal principal) {
		
		
		ModelAndView mv = new ModelAndView("index");
		Iterable<Aluno> alunos = er.findAll();
		String teste = principal.getName();
		mv.addObject("user", teste);
		mv.addObject("alunos", alunos);
		
		return mv;
	}

}
