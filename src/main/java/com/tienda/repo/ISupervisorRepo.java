package com.tienda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.model.Supervisor;


public interface ISupervisorRepo extends JpaRepository<Supervisor, Integer> {

}
