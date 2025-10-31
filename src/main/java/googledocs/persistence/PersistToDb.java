package googledocs.persistence;

import googledocs.document.Document;

public class PersistToDb implements Persistable {
    public PersistToDb() {}
    @Override
    public void save(String document) {
        System.out.println("Saving the document to db right now...");
    }
}
