package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServicio {
    @Autowired
    IPagoRepositorio repositorio;
}
