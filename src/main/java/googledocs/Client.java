package googledocs;

import googledocs.decorator.BoldStyle;
import googledocs.decorator.ItalicisedStyle;
import googledocs.document.Document;
import googledocs.documentelement.ImageElement;
import googledocs.documentelement.TextElement;
import googledocs.persistence.PersistToDisk;

public class Client {
    public static void main(String[] args) {
        Editor e = new Editor(new Document(), new PersistToDisk());
        e.addText(new BoldStyle(new TextElement("Hello world!")));
        e.addImage(new ImageElement("abc.png"));
        e.addNewLine();
        e.addTabSpace();
        e.addText(new TextElement("This line has a tab space at the start of the line."));
        e.addNewLine();
        e.addText(new BoldStyle(new ItalicisedStyle(new TextElement("This is a bold italicised statement."))));
        e.addNewLine();
        System.out.println(e.renderDocument());
    }
}
