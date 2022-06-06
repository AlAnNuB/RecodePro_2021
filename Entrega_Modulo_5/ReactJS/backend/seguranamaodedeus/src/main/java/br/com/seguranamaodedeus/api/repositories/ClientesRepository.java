package br.com.seguranamaodedeus.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.seguranamaodedeus.api.entities.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

	Clientes findByCpf(String cpf);
}