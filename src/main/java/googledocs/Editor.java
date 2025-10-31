package googledocs;

import googledocs.document.Document;
import googledocs.documentelement.ImageElement;
import googledocs.documentelement.Newline;
import googledocs.documentelement.TabElement;
import googledocs.documentelement.TextElement;
import googledocs.persistence.Persistable;

public class Editor {
    private Document document;
    private Persistable persistable;
    private String renderedDocument;

    public Editor(Document document, Persistable persistable) {
        this.document = document;
        this.persistable = persistable;
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String image) {
        document.addElement(new ImageElement(image));
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
