package com.controleDeEstagio.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.controleDeEstagio.models.Aluno;

@Controller
public class indexController {
	@RequestMapping("/")
	public ModelAndView index(Principal p) {
		
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("user", p.getName());
		
		return mv;
	}
		

}
