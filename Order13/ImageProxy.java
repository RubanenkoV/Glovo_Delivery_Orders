public class ImageProxy implements DisplayObject {
    private final String path;
    private ImageFile image;

    public ImageProxy(String path) {
        this.path = path;
    }

    public void display() {
        if (image == null) {
            image = new ImageFile(path);
        }
        image.display();
    }
}