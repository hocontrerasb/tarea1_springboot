package com.tienda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.model.CompraProducto;
import com.tienda.service.ICompraProductoService;

@RestController
@RequestMapping("/consultaventas")
public class CompraProductoController {
	/*
	@Autowired
	private ICompraProductoService service;
	
	@GetMapping(value = "/{idProducto}")
	public ResponseEntity<List<CompraProducto>> listar(@PathVariable("idProducto") Integer idProducto) {
		List<CompraProducto> consultasventa = new ArrayList<>();
		consultasventa = service.listarVentasPorProducto(idProducto);
		return new ResponseEntity<List<CompraProducto>>(consultasventa, HttpStatus.OK);
	}
	*/
}
