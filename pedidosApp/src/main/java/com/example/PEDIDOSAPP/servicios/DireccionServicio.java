package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IDireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServicio {
    @Autowired
    IDireccionRepositorio repositorio;
}
