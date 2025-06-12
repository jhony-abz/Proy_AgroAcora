package com.mycompany.proy_agroacora.Modelo;

public class Almacen {

    private int idAlmacen;
    private String ubicacion;

    public Almacen() {

    }

    public Almacen(int idAlmacen, String ubicacion) {
        this.idAlmacen = idAlmacen;
        this.ubicacion = ubicacion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
