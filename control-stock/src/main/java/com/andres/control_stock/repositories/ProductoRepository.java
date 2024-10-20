package com.andres.control_stock.repositories;

import com.andres.control_stock.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto ,Long> {
}
