package com.mycompany.proy_agroacora.Modelo;

import java.sql.*;
import java.util.*;

public class PedidoDAO {

    private Connection con;

    public PedidoDAO() {
        con = ConexionBD.getConexion();
    }
//Función para insertar nuevo pedido a la tabla

    public int insertar(Pedido p) {
        String sql = "INSERT INTO pedido(id_cliente, total) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, p.getIdCliente());
            ps.setDouble(2, p.getTotal());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Devuelve el ID generado
            }
        } catch (SQLException e) {
            System.err.println("Error insertando pedido: " + e);
        }
        return -1;
    }
//Función para listar la tabla

    public List<Pedido> listar() {
        List<Pedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Pedido p = new Pedido(
                        rs.getInt("id_pedido"),
                        rs.getInt("id_cliente"),
                        rs.getDate("fecha"),
                        //  rs.getString("estado"),
                        rs.getDouble("total")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error listando pedidos: " + e);
        }
        return lista;
    }
//Función para actualizar el estado del pedido

    public boolean actualizarEstado(int idPedido, String nuevoEstado) {
        String sql = "UPDATE pedido SET estado=? WHERE id_pedido=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nuevoEstado);
            ps.setInt(2, idPedido);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error actualizando estado: " + e);
            return false;
        }
    }

    public boolean eliminarPedido(int idPedido) {
        String sql = "DELETE FROM pedido WHERE id_pedido = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPedido);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
