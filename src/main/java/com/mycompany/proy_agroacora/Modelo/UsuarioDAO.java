package com.mycompany.proy_agroacora.Modelo;

import java.sql.*;

public class UsuarioDAO {
//Función para validar los datos del usuario

    public boolean verificarUsuario(String usuario, String contrasena) {
        boolean acceso = false;
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND contrasena = ?";

        try (Connection conn = ConexionBD.getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    acceso = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar usuario: " + e.getMessage());
        }

        return acceso;
    }
}
