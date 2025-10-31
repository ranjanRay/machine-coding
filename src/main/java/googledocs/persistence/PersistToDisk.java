package googledocs.persistence;

import googledocs.document.Document;

public class PersistToDisk implements Persistable {
    public PersistToDisk() {}
    @Override
    public void save(String document) {
        System.out.println("Saving document to the local disk...");
    }
}
