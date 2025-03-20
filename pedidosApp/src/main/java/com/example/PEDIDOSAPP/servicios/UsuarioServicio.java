package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    IUsuarioRepositorio repositorio;
}
