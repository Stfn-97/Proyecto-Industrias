package com.industrias.demo.pdf;

import java.io.IOException;
import java.util.List;

import com.industrias.demo.modelo.productos;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
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
		cell.setPhrase(new Phrase("ID Producto"));
		
		tabla.addCell(cell);
	}
	
	
	
	private void escribirDatosTabla(PdfPTable tabla) {
		
	}
	
	
	
	public void exportar(HttpServletResponse response) throws DocumentException, IOException {
		Document document = new Document(PageSize.A4);
		
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		
		document.add(new Paragraph("Lista de datos de todos los productos"));
		
		PdfPTable tabla = new PdfPTable(4);
		
		escribirEncabezadoTabla(tabla);
		escribirDatosTabla(tabla);
		
		document.add(tabla);
		
		document.close();
	}
	
}
