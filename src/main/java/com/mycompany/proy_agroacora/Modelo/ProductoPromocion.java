package com.mycompany.proy_agroacora.Modelo;

public class ProductoPromocion {

    private int idProducto;
    private int idPromocion;

    public ProductoPromocion() {

    }

    public ProductoPromocion(int idProducto, int idPromocion) {
        this.idProducto = idProducto;
        this.idPromocion = idPromocion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

}
