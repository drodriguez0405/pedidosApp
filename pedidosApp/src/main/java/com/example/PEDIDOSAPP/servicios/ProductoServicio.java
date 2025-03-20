package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {
    @Autowired
    IProductoRepositorio repositorio;
}
