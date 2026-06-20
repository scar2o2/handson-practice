package factory;

import document.Document;
import document.ExcelDocument;


public class ExcelDocumentFactory extends DocumentFactory {
	public Document createDocument() {
		return new ExcelDocument();
	}
}
