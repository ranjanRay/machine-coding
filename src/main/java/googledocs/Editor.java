package googledocs;

import googledocs.document.Document;
import googledocs.documentelement.*;
import googledocs.persistence.Persistable;

public class Editor {
    private Document document;
    private Persistable persistable;
    private String renderedDocument;

    public Editor(Document document, Persistable persistable) {
        this.document = document;
        this.persistable = persistable;
    }

    public void addText(DocumentElement element) {
        document.addElement(element);
    }

    public void addImage(DocumentElement image) {
        document.addElement(image);
    }

    public void addNewLine() {
        document.addElement(new Newline());
    }

    public void addTabSpace() {
        document.addElement(new TabElement());
    }

    public String renderDocument() {
        if(renderedDocument == null) {
            renderedDocument = document.renderElements();
        }
        return renderedDocument;
    }

    public void saveDocument() {
        persistable.save(renderDocument());
    }
}
