package com.tienda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.model.Vendedor;


public interface IVendedorRepo extends JpaRepository<Vendedor, Integer> {

}
