package googledocs.document;

import googledocs.documentelement.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> elements;
    private StringBuilder renderdDocument;
    public Document() {
        elements = new ArrayList<>();
        renderdDocument = new StringBuilder();
    }


    public void setRenderdDocument(String renderdDocument) {
        this.renderdDocument = new StringBuilder(renderdDocument);
    }

    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    public List<DocumentElement> getElements() {
        return elements;
    }

    public String renderElements() {
        for (DocumentElement element : elements) {
            renderdDocument.append(element.render());
        }
        return renderdDocument.toString();
    }

    public String getRenderdDocument() {
        return renderdDocument.toString();
    }
}
