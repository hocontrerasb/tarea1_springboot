package com.tienda.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tienda.model.CompraProducto;

public interface ICompraProductoRepo extends JpaRepository<CompraProducto, Integer> {
	
	//@Transactional
	@Modifying
	@Query(value = "INSERT INTO compra_producto(id_producto, id_venta) VALUES (:idProducto, :idVenta)", nativeQuery = true)
	Integer registrar(@Param("idProducto") Integer idProducto, @Param("idVenta") Integer idVenta);
	
	
	@Query("from CompraProducto cp where id_producto = :idProducto")
	List<CompraProducto> listarVentasPorProducto(@Param("idProducto") Integer idproducto);
  
}
 