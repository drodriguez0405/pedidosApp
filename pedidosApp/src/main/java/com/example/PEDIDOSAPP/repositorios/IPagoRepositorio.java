package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepositorio extends JpaRepository<Pago,Integer> {
}
