package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.ITiendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicio {
    @Autowired
    ITiendaRepositorio repositorio;
}
