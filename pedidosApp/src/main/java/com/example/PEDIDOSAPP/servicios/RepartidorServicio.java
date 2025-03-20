package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IRepartidorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartidorServicio {
    @Autowired
    IRepartidorRepositorio repositorio;
}
