package googledocs.documentelement;

public class ImageElement implements DocumentElement {
    private String imageUrl;

    public ImageElement(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    @Override
    public String render() {
        return "[Image: " + imageUrl + "]";
    }
}
