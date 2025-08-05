package com.itb.inf2em.pizzariaf.model.entity;

public class Pedido {

    private Long id;
    private String data_hora_pedido;
    private String data_hora_entrega;
    private String status;
    private String valor_total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_hora_pedido() {
        return data_hora_pedido;
    }

    public void setData_hora_pedido(String data_hora_pedido) {
        this.data_hora_pedido = data_hora_pedido;
    }

    public String getData_hora_entrega() {
        return data_hora_entrega;
    }

    public void setData_hora_entrega(String data_hora_entrega) {
        this.data_hora_entrega = data_hora_entrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValor_total() {
        return valor_total;
    }

    public void setValor_total(String valor_total) {
        this.valor_total = valor_total;
    }
}
