package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IDetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServicio {
    @Autowired
    IDetalleRepositorio repositorio;
}
