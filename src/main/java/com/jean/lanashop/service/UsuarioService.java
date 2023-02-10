package com.jean.lanashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jean.lanashop.model.entity.Usuario;
import com.jean.lanashop.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	};
}
