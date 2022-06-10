package br.com.guisilva.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guisilva.cursomc.entities.Produto;
import br.com.guisilva.cursomc.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public List<Produto> findAll() {
		return repository.findAll();
	}
}
