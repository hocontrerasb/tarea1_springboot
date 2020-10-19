package com.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.model.CompraProducto;
import com.tienda.repo.ICompraProductoRepo;
import com.tienda.service.ICompraProductoService;

@Service
public class CompraProductoServiceImpl implements ICompraProductoService {
	
	@Autowired
	private ICompraProductoRepo repo;
	
	
	@Override
	public List<CompraProducto> listarVentasPorProducto(Integer idproducto) {
		return repo.listarVentasPorProducto(idproducto); 
	}

}