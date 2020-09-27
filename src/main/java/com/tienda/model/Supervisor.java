package com.tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Supervisor;
	
	@Size(min = 5, message = "Nombre debe tener minimo 5 caracteres")
	@Column(name = "nombre_supervisor", nullable = false, length = 20)
	private String nombre_supervisor;
	
	@Size(min = 3, max = 150, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion_supervisor", nullable = false, length = 150)
	private String direccion_supervisor;
	
	@Size(max = 9, message = "Telefono debe tener minimo 9 caracteres")
	@Column(name = "telefono_supervisor", nullable = false, length = 9)
	private String telefono_supervisor;


}
