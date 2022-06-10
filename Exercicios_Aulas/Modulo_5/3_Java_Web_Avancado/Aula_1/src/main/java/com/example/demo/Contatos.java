package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {
	//camada de persistência, vou utilizar o Sprint Data JPA para criar o meu repositório de contatos
}
