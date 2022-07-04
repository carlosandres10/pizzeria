package com.upchiapas.Pizza.models;

public class ItemComprar {
    private byte cantidad;
    private float subtotal;
    private int i;

    public ItemComprar() {
        cantidad = 0;
    }

    public ItemComprar(byte can) {
        cantidad = can;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }
    public float getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

}
