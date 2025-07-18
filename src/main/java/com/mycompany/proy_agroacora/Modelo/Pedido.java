package com.mycompany.proy_agroacora.Modelo;

import java.sql.Date;

public class Pedido {

    private int idPedido;
    private int idCliente;
    private Date fechaPedido;
    // private String estado;
    private double total;

    public Pedido() {

    }

    public Pedido(int idPedido, int idCliente, Date fechaPedido, double total) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        // this.estado = estado;
        this.total = total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /*public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     */
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
