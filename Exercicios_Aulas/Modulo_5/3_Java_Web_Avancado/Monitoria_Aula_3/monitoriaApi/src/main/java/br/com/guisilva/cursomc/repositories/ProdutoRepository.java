package br.com.guisilva.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guisilva.cursomc.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
