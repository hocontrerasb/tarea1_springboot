package com.tienda.service;

import java.util.List;

import com.tienda.model.CompraProducto;


public interface ICompraProductoService  {
	
	

	List<CompraProducto> listarVentasPorProducto(Integer idProducto);
	
	

}
