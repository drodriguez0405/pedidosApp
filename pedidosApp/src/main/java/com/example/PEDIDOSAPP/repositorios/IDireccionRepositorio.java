package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionRepositorio extends JpaRepository<Direccion,Integer> {
}
