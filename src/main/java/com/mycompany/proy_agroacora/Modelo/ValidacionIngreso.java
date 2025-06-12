package com.mycompany.proy_agroacora.Modelo;

public class ValidacionIngreso {

    private static final String CONTRASENA_CORRECTA = "agroACORA";

    public boolean validarContrasena(String contrasena) {
        return CONTRASENA_CORRECTA.equals(contrasena);
    }
}
