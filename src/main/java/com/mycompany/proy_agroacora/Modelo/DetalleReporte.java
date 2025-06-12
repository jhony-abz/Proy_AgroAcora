package com.mycompany.proy_agroacora.Modelo;

public class DetalleReporte {

    private int idAlerta;
    private int idReporte;

    public DetalleReporte() {

    }

    public DetalleReporte(int idAlerta, int idReporte) {
        this.idAlerta = idAlerta;
        this.idReporte = idReporte;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

}
