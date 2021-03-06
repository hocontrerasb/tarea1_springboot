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
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Producto;
	
	@Size(min = 10, message = "Descripcion debe tener minimo 10 caracteres")
	@Column(name = "descripcion", nullable = false, length = 70)
	private String descripcion;
	
	@Size(min = 3, max = 150, message = "Valor debe tener minimo 3 caracteres")
	@Column(name = "valor_producto", nullable = false, length = 8)
	private int valor_producto;
			
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;

	public Integer getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(int valor_producto) {
		this.valor_producto = valor_producto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	
}
