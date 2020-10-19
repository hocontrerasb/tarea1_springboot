package com.tienda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
