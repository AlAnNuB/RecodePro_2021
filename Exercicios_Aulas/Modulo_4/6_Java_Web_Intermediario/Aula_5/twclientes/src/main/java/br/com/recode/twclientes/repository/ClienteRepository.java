package br.com.recode.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recode.twclientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
