package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepositorio extends JpaRepository<Producto,Integer> {
}
