package com.itb.inf2em.pizzariaf.model.entity;


import jakarta.persistence.*;

@Entity

@Table(name = "Telefone")



public class Telefone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(length = 45, nullable = false)

    private String ddd;
    @Column(length = 5, nullable = false)

    private String numero;
    @Column(length = 15, nullable = false)

    private Boolean codStatus;

    public void setDDD(String ddd) {
        this.ddd = ddd;
    }
    public String getDdd() {
        return ddd;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(Boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getNumero() {
        return numero;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
