package br.com.guisilva.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guisilva.cursomc.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
