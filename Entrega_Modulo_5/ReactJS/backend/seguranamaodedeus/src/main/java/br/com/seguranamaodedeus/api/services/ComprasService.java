package br.com.seguranamaodedeus.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.seguranamaodedeus.api.dto.ComprasDTO;
import br.com.seguranamaodedeus.api.dto.ViagensDTO;
import br.com.seguranamaodedeus.api.entities.Clientes;
import br.com.seguranamaodedeus.api.entities.Compras;
import br.com.seguranamaodedeus.api.entities.Viagens;
import br.com.seguranamaodedeus.api.repositories.ClientesRepository;
import br.com.seguranamaodedeus.api.repositories.ComprasRepository;
import br.com.seguranamaodedeus.api.repositories.ViagensRepository;

@Service
public class ComprasService {

	@Autowired
	private ViagensRepository viagensRepository;
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@Autowired
	private ComprasRepository comprasRepository;
	
	@Transactional
	public ViagensDTO saveViagens(ComprasDTO dto) {
		
		Clientes clientes = clientesRepository.findByCpf(dto.getCpf());
		if (clientes == null) {
			clientes = new Clientes();
			clientes.setCpf(dto.getCpf());
			clientes = clientesRepository.saveAndFlush(clientes);
		}
		
		Viagens viagens = viagensRepository.findById(dto.getViagensId()).get();
		Compras compras = new Compras();
		compras.setViagens(viagens);
		compras.setClientes(clientes);
		compras.setValorTotal(dto.getValorTotal());
		
		compras = comprasRepository.saveAndFlush(compras);
		
		return new ViagensDTO();
		
	}
}
