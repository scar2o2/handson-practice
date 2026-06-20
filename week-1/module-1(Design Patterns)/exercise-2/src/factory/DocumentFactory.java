package factory;

import document.Document;

public abstract class DocumentFactory {
	public abstract Document createDocument();
	public void openDocument() {
        Document document = createDocument();
        document.openDocument();
    }
}
