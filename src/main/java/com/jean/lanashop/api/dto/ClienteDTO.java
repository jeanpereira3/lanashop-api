package com.jean.lanashop.api.dto;

import com.jean.lanashop.model.enums.TipoCliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	private String senha;
	
	
}
