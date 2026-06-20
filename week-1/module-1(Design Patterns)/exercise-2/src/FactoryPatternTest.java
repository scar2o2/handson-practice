import java.util.Scanner;

import factory.WordDocumentFactory;
import factory.PdfDocumentFactory;
import factory.ExcelDocumentFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.toUpperCase().equals("WDF")) {
			WordDocumentFactory wdf=new WordDocumentFactory();
			wdf.openDocument();
		}
		else if(s.toUpperCase().equals("PDF")) {
			PdfDocumentFactory pdf=new PdfDocumentFactory();
			pdf.openDocument();
		}
		else {
			ExcelDocumentFactory edf=new ExcelDocumentFactory();
			edf.openDocument();
		}
	}

}
