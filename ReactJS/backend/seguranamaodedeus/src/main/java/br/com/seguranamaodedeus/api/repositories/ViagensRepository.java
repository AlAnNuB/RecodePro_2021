package br.com.seguranamaodedeus.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.seguranamaodedeus.api.entities.Viagens;

@Repository
public interface ViagensRepository extends JpaRepository<Viagens, Long> {

}