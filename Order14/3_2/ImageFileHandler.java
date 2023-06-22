public class ImageFileHandler extends AbstractFileHandler {
    protected boolean canHandleFile(String fileName) {
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }

    protected void openFile(String fileName) {
        System.out.println("Opening image file: " + fileName);
        // код для відкриття зображення
    }
}