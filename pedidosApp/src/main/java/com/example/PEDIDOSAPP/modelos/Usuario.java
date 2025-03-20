package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.UsuarioEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="usuario_tabla")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "nombre", length = 100, unique = true, nullable = false)
    private String nombre;

    @Column(name = "correo_electronico", length = 150, unique = true, nullable = false)
    private String correoElectronico;

    @Column(name = "contraseña", length = 255, nullable = false)
    private String contraseña;

    @Column(name = "telefono", length = 20, nullable = false)
    private String telefono;

    @Column(name = "tipo_usuario", nullable = false)
    private UsuarioEnum tipoUsuario;

    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private List<Direccion> direcciones;

    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private List<Pedido> pedidos;



    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String correoElectronico, String contraseña, String telefono, UsuarioEnum tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public UsuarioEnum getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(UsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
