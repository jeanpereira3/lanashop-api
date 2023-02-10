package com.jean.lanashop.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.lanashop.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
