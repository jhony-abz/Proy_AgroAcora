package com.mycompany.proy_agroacora.Modelo;

import java.sql.Date;

public class Lote {

    private int idLote;
    private int idProducto;
    private Date fechaVencimiento;
    private int cantidad;
    private String estado;

    public Lote() {

    }

    public Lote(int idLote, int idProducto, Date fechaVencimiento, int cantidad, String estado) {
        this.idLote = idLote;
        this.idProducto = idProducto;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
