package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.EntregaEstadoEnum;
import jakarta.persistence.*;

@Entity
@Table(name="entrega_tabla")
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega")
    private Integer id;

    @Column(name = "fecha_entrega",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String fechaEntrega;

    @Column(name = "estado_entrega", columnDefinition =  "ENUM('asignado', 'en camino', 'entregado') DEFAULT 'asignado'")
    private EntregaEstadoEnum estadoEntrega;


    public Entrega() {
    }

    public Entrega(Integer id, String fechaEntrega, EntregaEstadoEnum estadoEntrega) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EntregaEstadoEnum getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(EntregaEstadoEnum estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
}
