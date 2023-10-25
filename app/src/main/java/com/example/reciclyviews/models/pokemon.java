package com.example.reciclyviews.models;

import java.util.List;

public class pokemon {
    private String nombre;
    private Integer numero;
    private Tipo tipo;

    private List<String> ataques;

    public List<String> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<String> ataques) {
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
