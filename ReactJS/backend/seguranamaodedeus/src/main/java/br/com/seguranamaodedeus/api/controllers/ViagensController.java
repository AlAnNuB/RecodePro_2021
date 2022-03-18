package br.com.seguranamaodedeus.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguranamaodedeus.api.dto.ViagensDTO;
import br.com.seguranamaodedeus.api.services.ViagensService;

@RestController
@RequestMapping(value = "/Destinos")
public class ViagensController {

	@Autowired
	private ViagensService service;

	@GetMapping
	public Page<ViagensDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ViagensDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
