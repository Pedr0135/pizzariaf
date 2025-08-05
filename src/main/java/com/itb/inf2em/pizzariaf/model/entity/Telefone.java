package com.itb.inf2em.pizzariaf.model.entity;

public class Telefone {

    private Long id;
    private int ddd;
    private int numero;
    private String cod_status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCod_status() {
        return cod_status;
    }

    public void setCod_status(String cod_status) {
        this.cod_status = cod_status;
    }
}
