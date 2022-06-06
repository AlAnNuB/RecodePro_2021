package br.com.seguranamaodedeus.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguranamaodedeus.api.dto.ComprasDTO;
import br.com.seguranamaodedeus.api.dto.ViagensDTO;
import br.com.seguranamaodedeus.api.services.ComprasService;

@RestController
@RequestMapping(value = "/ComprasFeitas")
public class ComprasController {

	@Autowired
	private ComprasService service;
	
	@PutMapping
	public ViagensDTO SaveScore(@RequestBody ComprasDTO dto) {
		ViagensDTO viagensDTO = service.saveViagens(dto);
		return viagensDTO;
	}
}
