package com.jean.lanashop.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jean.lanashop.api.dto.ClienteDTO;
import com.jean.lanashop.model.entity.Cliente;
import com.jean.lanashop.service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteResource {
	
	private final ClienteService clienteService;
	
	@PostMapping("salvar")
	public ResponseEntity salvar(@RequestBody ClienteDTO dto) {
		Cliente cliente = Cliente
				.builder()
				.nome(dto.getNome())
				.email(dto.getEmail())
				.cpfOuCnpj(dto.getCpfOuCnpj())
				.tipo(dto.getTipo().toString())
				.senha(dto.getSenha())
				.build();
		
		try {
			Cliente clienteSalvo = clienteService.salvarCliente(cliente);
			return new ResponseEntity(clienteSalvo, HttpStatus.CREATED);
		} catch (Exception e) {
			//tratar Exception
			return ResponseEntity.badRequest().body("erro");
		}
	}

}
