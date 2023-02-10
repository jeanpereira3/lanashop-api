package com.jean.lanashop.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone", schema = "lanashop")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "ddd")
	private String ddd;
	@Column(name = "numnero")
	private String numero;
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
}
