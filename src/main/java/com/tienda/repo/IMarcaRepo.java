package com.tienda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.model.Marca;


public interface IMarcaRepo extends JpaRepository<Marca, Integer> {

}
