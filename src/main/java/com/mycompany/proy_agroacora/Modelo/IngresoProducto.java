package com.mycompany.proy_agroacora.Modelo;

import java.sql.Date;

public class IngresoProducto {

    private int idIngreso;
    private int idProveedor;
    private int idLote;
    private Date fechaIngreso;
    private int cantidad;

    public IngresoProducto() {
    }

    public IngresoProducto(int idIngreso, int idProveedor, int idLote, Date fechaIngreso, int cantidad) {
        this.idIngreso = idIngreso;
        this.idProveedor = idProveedor;
        this.idLote = idLote;
        this.fechaIngreso = fechaIngreso;
        this.cantidad = cantidad;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
