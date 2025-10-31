package googledocs.documentelement;

public class Newline implements DocumentElement {
    @Override
    public String render() {
        return "\n";
    }
}
