package com.recode.aula;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends 
                          JpaRepository<Contato, Long>{
}
