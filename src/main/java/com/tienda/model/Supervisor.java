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
	private Integer idSupervisor;
	
	@Size(min = 5, message = "Nombre debe tener minimo 5 caracteres")
	@Column(name = "nombre_supervisor", nullable = false, length = 20)
	private String nombre_supervisor;
	
	@Size(min = 3, max = 150, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion_supervisor", nullable = false, length = 150)
	private String direccion_supervisor;
	
	@Size(max = 9, message = "Telefono debe tener minimo 9 caracteres")
	@Column(name = "telefono_supervisor", nullable = false, length = 9)
	private String telefono_supervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombre_supervisor() {
		return nombre_supervisor;
	}

	public void setNombre_supervisor(String nombre_supervisor) {
		this.nombre_supervisor = nombre_supervisor;
	}

	public String getDireccion_supervisor() {
		return direccion_supervisor;
	}

	public void setDireccion_supervisor(String direccion_supervisor) {
		this.direccion_supervisor = direccion_supervisor;
	}

	public String getTelefono_supervisor() {
		return telefono_supervisor;
	}

	public void setTelefono_supervisor(String telefono_supervisor) {
		this.telefono_supervisor = telefono_supervisor;
	}

	
	
}
