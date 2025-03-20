package com.example.PEDIDOSAPP.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="detalle_tabla")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id;

    @Column(name = "cantidad",nullable = false)
    private int cantidad;

    @Column(name = "subtotal",precision = 10,scale = 2,nullable = false)
    private double subtotal;

    @OneToMany(mappedBy = "detalle")
    @JsonManagedReference
    private List<Detalle> detalles;
    

    public Detalle() {
    }

    public Detalle(Integer id, int cantidad, double subtotal) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
