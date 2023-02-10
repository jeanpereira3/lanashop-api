package com.jean.lanashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jean.lanashop.model.entity.Cliente;
import com.jean.lanashop.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	};
}
