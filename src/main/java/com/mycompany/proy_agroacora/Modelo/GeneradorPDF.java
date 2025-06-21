package com.mycompany.proy_agroacora.Modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

public class GeneradorPDF {
//Clase encargada de la generación del pdf para los pedidos

    public static void generarResumenPDF(Cliente cliente, DefaultTableModel modeloTabla, double total, int idPedido, String rutaSalida) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(rutaSalida));
            document.open();

            // Título
            Paragraph titulo = new Paragraph("Resumen de Pedido", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(new Paragraph("\n"));

            // Código de pedido y fecha
            String codigoPedido = String.format("E%04d", idPedido);
            Paragraph codPar = new Paragraph("Código de Pedido: " + codigoPedido);
            Paragraph fechaPar = new Paragraph("Fecha: " + LocalDate.now().toString());
            document.add(codPar);
            document.add(fechaPar);
            document.add(new Paragraph("\n"));

            // Información del Cliente
            document.add(new Paragraph("Cliente: " + cliente.getNombre()));
            document.add(new Paragraph("DNI: " + cliente.getDNI()));
            document.add(new Paragraph("Dirección: " + cliente.getDireccion()));
            document.add(new Paragraph("Teléfono: " + cliente.getTelefono()));
            document.add(new Paragraph("Correo: " + cliente.getEmail()));
            document.add(new Paragraph("\n"));

            // Tabla de productos
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            tabla.setWidths(new float[]{3f, 1f, 1f, 1f});
            tabla.addCell("Producto");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio U.");
            tabla.addCell("Subtotal");

            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                tabla.addCell(modeloTabla.getValueAt(i, 0).toString());
                tabla.addCell(modeloTabla.getValueAt(i, 1).toString());
                tabla.addCell("S/ " + modeloTabla.getValueAt(i, 2).toString());
                tabla.addCell("S/ " + modeloTabla.getValueAt(i, 3).toString());
            }

            document.add(tabla);
            document.add(new Paragraph("\n"));

            // Total
            Paragraph totalP = new Paragraph("Total del Pedido: S/ " + String.format("%.2f", total),
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
            totalP.setAlignment(Element.ALIGN_RIGHT);
            document.add(totalP);

            document.close();

            System.out.println("PDF generado exitosamente en: " + rutaSalida);

            // Abrir el PDF automáticamente
            Desktop.getDesktop().open(new File(rutaSalida));

        } catch (Exception e) {
            System.err.println("Error generando PDF: " + e.getMessage());
        }
    }
}
