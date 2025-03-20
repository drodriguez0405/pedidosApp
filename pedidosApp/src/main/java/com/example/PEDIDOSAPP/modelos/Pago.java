package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.PagoEstadoEnum;
import com.example.PEDIDOSAPP.ayudas.enums.PagoMetodoEnum;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pago_tabla")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer id;

    @Column(name = "fecha_pago",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String fechaPago;

    @Column(name = "estado_pago", columnDefinition =  "ENUM('pendiente', 'fallido', 'completado') DEFAULT 'pendiente'")
    private PagoEstadoEnum estado;

    @Column(name = "metodo_pago",nullable = false)
    private PagoMetodoEnum metodo;

    @OneToMany(mappedBy = "pago")
    @JsonManagedReference
    private List<Pedido> pedidos;

    public Pago() {
    }

    public Pago(Integer id, String fechaPago, PagoEstadoEnum estado, PagoMetodoEnum metodo) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.metodo = metodo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public PagoEstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(PagoEstadoEnum estado) {
        this.estado = estado;
    }

    public PagoMetodoEnum getMetodo() {
        return metodo;
    }

    public void setMetodo(PagoMetodoEnum metodo) {
        this.metodo = metodo;
    }
}
