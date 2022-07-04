package com.upchiapas.Pizza.models;

public class OrdenCompra {
    private int id;
    private String nomPedido;
    private String tipoPizza;

    public OrdenCompra() {
        nomPedido = "";
        id = 0;
        tipoPizza = "";
    }

    public OrdenCompra(String np, int id2, String tp) {
        nomPedido = np;
        id = id2;
        tipoPizza = tp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePedido() {
        return nomPedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nomPedido = nombrePedido;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

}
