package com.recode.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.aula.model.Produto;
import com.recode.aula.model.Produtos;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private Produtos produtosDAO;
	
	@GetMapping
	public List<Produto> pesquisar(){
		return produtosDAO.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto buscar(@PathVariable Long id) {
		return produtosDAO.findById(id).get();
	}
	
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtosDAO.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtosDAO.deleteById(id);
	}
	
	@PutMapping
	public void alterar(@RequestBody Produto produto) {
		produtosDAO.save(produto);
	}
	
	
}
