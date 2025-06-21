package com.mycompany.proy_agroacora.Modelo;

import java.sql.*;
import java.util.*;

public class ClienteDAO {

    private Connection con;

    public ClienteDAO() {
        this.con = ConexionBD.conectar();
    }
//Función para insertar nuevo cliente

    public boolean insertar(Cliente c) {
        String sql = "INSERT INTO cliente(nombre, dni, direccion, telefono, correo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDNI());
            ps.setString(3, c.getDireccion());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getEmail());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error insertando cliente: " + e.getMessage());
            return false;
        }
    }
//Función para mostrar todos los clientes en la tabla

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("dni"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("direccion")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error listando clientes: " + e);
        }
        return lista;
    }
//Función de búsqueda por dni

    public Cliente buscarPorDNI(String dni) {
        String sql = "SELECT * FROM cliente WHERE dni = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("dni"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("direccion")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error buscando cliente por DNI: " + e.getMessage());
        }
        return null;
    }
//Función para actualizar datos del cliente - Pendiente

    public boolean actualizar(Cliente c) {
        String sql = "UPDATE cliente SET nombre=?, dni=?, direccion=?, telefono=?, correo=? WHERE id_cliente=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDNI());
            ps.setString(3, c.getDireccion());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getEmail());
            ps.setInt(6, c.getIdCliente());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error actualizando cliente: " + e);
            return false;
        }
    }
//Función para eliminar cliente de la tabla - pendiente

    public boolean eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE id_cliente=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error eliminando cliente: " + e);
            return false;
        }
    }
}
