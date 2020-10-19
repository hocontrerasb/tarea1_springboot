package com.tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Vendedor;
	
	@Size(min = 5, message = "Nombre debe tener minimo 5 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 20)
	private String nombre_vendedor;
	
	@Size(min = 3, max = 150, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion_vendedor", nullable = false, length = 150)
	private String direccion_vendedor;
	
	@ManyToOne
	@JoinColumn(name = "idSupervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;

	public Integer getId_Vendedor() {
		return id_Vendedor;
	}

	public void setId_Vendedor(Integer id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getDireccion_vendedor() {
		return direccion_vendedor;
	}

	public void setDireccion_vendedor(String direccion_vendedor) {
		this.direccion_vendedor = direccion_vendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}


}
