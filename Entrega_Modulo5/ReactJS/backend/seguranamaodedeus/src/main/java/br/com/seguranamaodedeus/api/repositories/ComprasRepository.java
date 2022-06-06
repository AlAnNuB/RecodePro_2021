package br.com.seguranamaodedeus.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.seguranamaodedeus.api.entities.Compras;
import br.com.seguranamaodedeus.api.entities.ComprasPK;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, ComprasPK> {

}