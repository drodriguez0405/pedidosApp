package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntregaRepositorio extends JpaRepository<Entrega,Integer> {
}
