package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Repartidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepartidorRepositorio extends JpaRepository<Repartidor,Integer> {
}
