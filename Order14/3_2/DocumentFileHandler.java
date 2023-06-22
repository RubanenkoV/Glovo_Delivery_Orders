public class DocumentFileHandler extends AbstractFileHandler {
    protected boolean canHandleFile(String fileName) {
        return fileName.endsWith(".doc") || fileName.endsWith(".docx") || fileName.endsWith(".pdf");
    }

    protected void openFile(String fileName) {
        System.out.println("Opening document file: " + fileName);
        // код для відкриття документа
    }
}
