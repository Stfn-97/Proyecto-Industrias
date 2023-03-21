package com.industrias.demo.pdf;

import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.industrias.demo.modelo.productos;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

public class datosProductosPdf {
	private List<productos> Productos;

	public datosProductosPdf(List<productos> productos) {
		super();
		Productos = productos;
	}
	

	
	
	private void escribirEncabezadoTabla(PdfPTable tabla) {
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);
		
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.WHITE);
		
		
		cell.setPhrase(new Phrase("ID Producto", font));
		
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Nombre Producto", font));
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Descripcion", font));
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Marca", font));
		tabla.addCell(cell);
	}
	
	
	
	private void escribirDatosTabla(PdfPTable tabla) {
		
		for (productos Productos : Productos) {
			tabla.addCell(String.valueOf(Productos.getID_Producto()));
			tabla.addCell(Productos.getNombre_Producto());
			tabla.addCell(Productos.getDescripcion());
			tabla.addCell(Productos.getMarca());
		}
		
	}
	
	
	
	public void exportar(HttpServletResponse response) throws DocumentException, IOException {
		Document document = new Document(PageSize.A4);
		
		PdfWriter.getInstance(document, response.getOutputStream());
		
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());
		
		document.open();
		
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setColor(Color.BLUE);
		font.setSize(18);
		
		Paragraph title = new Paragraph("Lista de datos de productos en inventario", font);
		title.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(title);
		document.add(new Paragraph("Fecha y hora de exportación: " + currentDateTime));
		
		
		PdfPTable tabla = new PdfPTable(4);
		tabla.setWidthPercentage(100);
		tabla.setSpacingBefore(15);
		tabla.setWidths(new float [] {2.0f, 3.5f, 3.0f, 1.5f});
		
		
		
		escribirEncabezadoTabla(tabla);
		escribirDatosTabla(tabla);
		
		document.add(tabla);
		
		document.close();
	}
	
}
