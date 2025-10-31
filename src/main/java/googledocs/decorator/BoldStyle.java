package googledocs.decorator;

import googledocs.documentelement.DocumentElement;

public class BoldStyle extends StyleDecorator {
    private final DocumentElement documentElement;
    public BoldStyle(DocumentElement documentElement) {
        this.documentElement = documentElement;
    }
    @Override
    public String render() {
        return "<bf>" + documentElement.render() + "</bf>";
    }
}
