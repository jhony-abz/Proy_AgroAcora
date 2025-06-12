package com.mycompany.proy_agroacora.Modelo;

public class Alerta {

    private int idAlerta;
    private int idLote;
    private String tipoAlerta;
    private String mensaje;

    public Alerta() {

    }

    public Alerta(int idAlerta, int idLote, String tipoAlerta, String mensaje) {
        this.idAlerta = idAlerta;
        this.idLote = idLote;
        this.tipoAlerta = tipoAlerta;
        this.mensaje = mensaje;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
