package com.jean.lanashop.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.lanashop.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
