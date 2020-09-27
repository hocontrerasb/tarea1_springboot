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
	
		

}
