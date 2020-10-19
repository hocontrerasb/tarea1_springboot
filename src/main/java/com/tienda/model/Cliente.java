package com.tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Cliente;
	
	@Size(min = 5, message = "Nombre Cliente debe tener minimo 5 caracteres")
	@Column(name = "nombre_cliente", nullable = false, length = 20)
	private String nombre_cliente;
	
	@Size(min = 3, max = 150, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;
	
	//@Size(message = "Telefono debe tener minimo 8 caracteres")
	@Column(name = "telefono", nullable = false)
	private int telefono;

	public Integer getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
		


}
