package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contatos")
public class ContatosController {
	
	@Autowired
	private Contatos contatos;
	
	@GetMapping
	public ModelAndView listar() {
		List<Contato> lista = contatos.findAll();
		ModelAndView mav = new ModelAndView("contatosView");
		mav.addObject("listaContatos", lista);
		return mav;
	}
}
