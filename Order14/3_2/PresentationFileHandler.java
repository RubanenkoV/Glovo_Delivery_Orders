public class PresentationFileHandler extends AbstractFileHandler {
    protected boolean canHandleFile(String fileName) {
        return fileName.endsWith(".pptx");
    }

    protected void openFile(String fileName) {
        System.out.println("Opening presentation file: " + fileName);
        // код для відкриття презентації
    }
}