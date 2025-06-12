package com.mycompany.proy_agroacora.Modelo;

import java.sql.Date;

public class SalidaProducto {

    private int idSalida;
    private int idLote;
    private int idPedido;
    private Date fechaSalida;
    private int cantidad;

    public SalidaProducto() {

    }

    public SalidaProducto(int idSalida, int idLote, int idPedido, Date fechaSalida, int cantidad) {
        this.idSalida = idSalida;
        this.idLote = idLote;
        this.idPedido = idPedido;
        this.fechaSalida = fechaSalida;
        this.cantidad = cantidad;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
