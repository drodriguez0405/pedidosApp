package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepositorio extends JpaRepository <Pedido,Integer> {
}
