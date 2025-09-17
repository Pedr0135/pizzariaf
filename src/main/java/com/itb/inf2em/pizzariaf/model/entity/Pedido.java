package com.itb.inf2em.pizzariaf.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45, nullable = false)

    private double valorPedido;
    @Column(length = 45, nullable = false)

    private LocalDateTime data_hora_pedido;
    @Column( nullable = false)


    private LocalDateTime data_hora_entrega;
    @Column( nullable = true)


    private boolean codstatus;


    private String status;



    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setStatus(String Status) {
        this.status = status;
    }
    public String getNome() {
        return status;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getData_hora_pedido() {
        return data_hora_pedido;
    }

    public void setData_hora_pedido(LocalDateTime data_hora_pedido) {
        this.data_hora_pedido = data_hora_pedido;
    }

    public LocalDateTime getData_hora_entrega() {
        return data_hora_entrega;
    }

    public void setData_hora_entrega(LocalDateTime data_hora_entrega) {
        this.data_hora_entrega = data_hora_entrega;
    }

    public String getStatus() {
        return status;
    }
}
