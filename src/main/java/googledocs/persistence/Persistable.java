package googledocs.persistence;

import googledocs.document.Document;

public interface Persistable {
    void save(String document);
}
