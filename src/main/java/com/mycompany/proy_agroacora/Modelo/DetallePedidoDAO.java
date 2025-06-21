package com.mycompany.proy_agroacora.Modelo;

import java.sql.*;
import java.util.*;

public class DetallePedidoDAO {

    private Connection con;

    public DetallePedidoDAO() {
        con = ConexionBD.getConexion();
    }
//Función para insertar detalles a la tabla

    public boolean insertar(DetallePedido dp) {
        String sql = "INSERT INTO detalle_pedido(id_pedido, id_producto, cantidad, precio_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dp.getIdPedido());
            ps.setInt(2, dp.getIdProducto());
            ps.setInt(3, dp.getCantidad());
            ps.setDouble(4, dp.getPrecioUnitario());  // Nuevo campo
            ps.setDouble(5, dp.getSubtotal());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error insertando detalle: " + e);
            return false;
        }
    }
//Función para listar los detalles

    public List<DetallePedido> listarPorPedido(int idPedido) {
        List<DetallePedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM detalle_pedido WHERE id_pedido=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido dp = new DetallePedido(
                        rs.getInt("id_detalle"),
                        rs.getInt("id_pedido"),
                        rs.getInt("id_producto"),
                        rs.getInt("cantidad"),
                        rs.getDouble("subtotal")
                );
                lista.add(dp);
            }
        } catch (SQLException e) {
            System.err.println("Error listando detalles: " + e);
        }
        return lista;
    }
}
