package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    //ACA DENTRO DEL REPO VAN LAS CONSULTAS PERSONALIZADAS
}
