package com.example.PEDIDOSAPP.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "producto_tabla")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;

    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;

    @Column(name = "precio",precision = 10, scale = 2, nullable = false)
    private Double precio;

    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "fk_tienda", referencedColumnName = "id_tienda")
    @JsonBackReference
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "fk_detalle", referencedColumnName = "id_detalle")
    @JsonBackReference
    private Detalle detalle;

    public Producto() {
    }

    public Producto(Integer id, String nombre, Double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
