package googledocs.decorator;

import googledocs.documentelement.DocumentElement;

public class ItalicisedStyle extends StyleDecorator {
    private final DocumentElement documentElement;

    public ItalicisedStyle(DocumentElement documentElement) {
        this.documentElement = documentElement;
    }

    @Override
    public String render() {
        return "<i>" + documentElement.render() + "</i>";
    }
}
