package com.tienda.model;

import java.util.Date;

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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Venta;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_cliente_venta"))
	private Cliente cliente;
	
	//vendedor
	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_venta"))
	private Vendedor vendedor;
	
	@Size(min = 3, message = "Costo debe tener minimo 3 caracteres")
	@Column(name = "costo", nullable = false, length = 10)
	private String costo;
	
	@DateTimeFormat
	@Size(max = 10, message = "Se debe ingresar fecha")
	@Column(name = "fecha_venta", nullable = false, length = 10)
	private Date fecha_venta;

	public Integer getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(Integer id_Venta) {
		this.id_Venta = id_Venta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	
		

}
