package com.recode.aula.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends 
                          JpaRepository<Contato, Long>{
}
