package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IEntregaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaServicio {
    @Autowired
    IEntregaRepositorio repositorio;
}
