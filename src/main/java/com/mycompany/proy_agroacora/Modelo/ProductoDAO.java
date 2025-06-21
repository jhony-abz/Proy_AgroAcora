package com.mycompany.proy_agroacora.Modelo;

import java.sql.*;
import java.util.*;

public class ProductoDAO {

    private Connection con;

    public ProductoDAO() {
        con = ConexionBD.getConexion();
    }
//Función para insertar producto a la tabla - Pendiente de uso

    public boolean insertar(Producto p) {
        String sql = "INSERT INTO producto(nombre, descripcion, precio, stock) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error insertando producto: " + e);
            return false;
        }
    }
//Función para listar productos de la tabla

    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Producto p = new Producto(
                        rs.getInt("id_producto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error listando productos: " + e);
        }
        return lista;
    }
//Función para actualizar algún producto - Pendiente de uso

    public boolean actualizar(Producto p) {
        String sql = "UPDATE producto SET nombre=?, descripcion=?, precio=?, stock=? WHERE id_producto=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setInt(5, p.getIdProducto());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error actualizando producto: " + e);
            return false;
        }
    }
//Función para eliminar un producto de la bd - Pendiende de uso

    public boolean eliminar(int id) {
        String sql = "DELETE FROM producto WHERE id_producto=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error eliminando producto: " + e);
            return false;
        }
    }
}
