package com.mycompany.proy_agroacora.Modelo;

public class Inventario {

    private int idInventario;
    private int idLote;
    private int idAlmacen;
    private int stockActual;

    public Inventario() {

    }

    public Inventario(int idInventario, int idLote, int idAlmacen, int stockActual) {
        this.idInventario = idInventario;
        this.idLote = idLote;
        this.idAlmacen = idAlmacen;
        this.stockActual = stockActual;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

}
