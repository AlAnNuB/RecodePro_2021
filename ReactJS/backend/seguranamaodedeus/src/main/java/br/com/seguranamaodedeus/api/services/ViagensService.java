package br.com.seguranamaodedeus.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.seguranamaodedeus.api.dto.ViagensDTO;
import br.com.seguranamaodedeus.api.entities.Viagens;
import br.com.seguranamaodedeus.api.repositories.ViagensRepository;

@Service
public class ViagensService {

	@Autowired
	private ViagensRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ViagensDTO> findAll(Pageable pageable) {
		Page<Viagens> result = repository.findAll(pageable);
		Page<ViagensDTO> page = result.map(x -> new ViagensDTO(x));
		return page;
	}
	
	public ViagensDTO findById(Long id) {
		Viagens result = repository.findById(id).get();
		ViagensDTO dto = new ViagensDTO(result);
		return dto;
	}
}
