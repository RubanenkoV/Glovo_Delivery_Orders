public class ImageGallery {
    public static void main(String[] args) {
        DisplayObject[] images = {
                new ImageProxy("src/image1.jpeg"),
                new ImageProxy("src/image2.jpeg"),
                new ImageProxy("src/image3.jpeg"),
                new ImageProxy("src/image4.jpeg"),
                new ImageProxy("src/image5.jpeg"),
                new ImageProxy("src/image6.jpeg"),
                new ImageProxy("src/image7.jpeg"),
                new ImageProxy("src/image8.jpeg"),
                new ImageProxy("src/image9.jpeg"),
                new ImageProxy("src/image10.jpeg")
        };

        for (DisplayObject image : images) {
            image.display();
        }
    }
}