package com.tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Cliente;
	
	@Size(min = 5, message = "Nombre debe tener minimo 5 caracteres")
	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;
	
	@Size(min = 3, max = 150, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;
	
	@Size(min = 9, message = "Telefono debe tener minimo 9 caracteres")
	@Column(name = "telefono", nullable = false, length = 9)
	private int telefono;
		


}
