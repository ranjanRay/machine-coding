package googledocs;

import googledocs.document.Document;
import googledocs.persistence.PersistToDisk;

public class Client {
    public static void main(String[] args) {
        Editor e = new Editor(new Document(), new PersistToDisk());
        e.addText("Hello world!");
        e.addImage("abc.png");
        e.addTabSpace();
        e.addNewLine();
        e.addText("This is a short document.");
        e.addNewLine();
        System.out.println(e.renderDocument());
    }
}
