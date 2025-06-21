package com.mycompany.proy_agroacora.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
//Clase de conexión a la BD - MySQL

    private static final String URL = "jdbc:mysql://localhost:3306/acora_bd";
    private static final String USER = "root";
    private static final String PASSWORD = "200919";

    public static void main(String[] args) {
        Connection conn = conectar();
        if (conn != null) {
            System.out.println("¡La conexión fue exitosa!");
            try {
                conn.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }

    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conn;
    }

    // 👇 Este es el método que necesitas para usar en tus DAO
    public static Connection getConexion() {
        return conectar();
    }
}
