package com.mycompany.proy_agroacora.Modelo;

import com.mycompany.proy_agroacora.Modelo.UsuarioDAO;

public class ValidacionIngreso {

    private UsuarioDAO usuarioDAO;

    public ValidacionIngreso() {
        usuarioDAO = new UsuarioDAO();
    }
//Función que evalúa los datos de la ventana con el DAO

    public boolean validarUsuario(String usuario, String contrasena) {
        return usuarioDAO.verificarUsuario(usuario, contrasena);
    }
}
