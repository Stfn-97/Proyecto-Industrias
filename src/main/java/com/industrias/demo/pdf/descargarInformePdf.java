package com.industrias.demo.pdf;

import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.industrias.demo.modelo.ventas;
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

public class descargarInformePdf {
	private List<ventas> Ventas;
	
	public descargarInformePdf(List<ventas> ventas) {
		super();
		Ventas = ventas;
	}
	
	
	
	private void escribirEncabezadoTabla(PdfPTable tabla) {
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);
		
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.WHITE);
		
		
		cell.setPhrase(new Phrase("ID Venta", font));
		
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Fecha de venta", font));
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Unidades adquiridas", font));
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Precio unidad", font));
		tabla.addCell(cell);
		
		cell.setPhrase(new Phrase("Precio total", font));
		tabla.addCell(cell);
	}
	
	
	private void escribirDatosTabla(PdfPTable tabla) {
		
		for (ventas Ventas : Ventas) {
			tabla.addCell(String.valueOf(Ventas.getID_Venta()));
			tabla.addCell(String.valueOf(Ventas.getFecha_y_hora_venta()));
			tabla.addCell(String.valueOf(Ventas.getUnidades_adquiridas()));
			tabla.addCell(String.valueOf(Ventas.getPrecio_unidad()));
			tabla.addCell(String.valueOf(Ventas.getPrecio_total()));
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
		
		Paragraph title = new Paragraph("Lista de ventas", font);
		title.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(title);
		document.add(new Paragraph("Fecha y hora de exportación: " + currentDateTime));
		
		
		PdfPTable tabla = new PdfPTable(5);
		tabla.setWidthPercentage(100);
		tabla.setSpacingBefore(15);
		tabla.setWidths(new float [] {1.0f, 2.5f, 1.5f, 1.0f, 1.0f});
		
		
		
		escribirEncabezadoTabla(tabla);
		escribirDatosTabla(tabla);
		
		document.add(tabla);
		
		document.close();
	}
	
}
