package factory;

import document.Document;
import document.PdfDocument;


public class PdfDocumentFactory extends DocumentFactory{
	public Document createDocument() {
		return new PdfDocument();
	}
}
