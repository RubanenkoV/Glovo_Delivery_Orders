public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        // Створюємо обробники
        AbstractFileHandler imageHandler = new ImageFileHandler();
        AbstractFileHandler documentHandler = new DocumentFileHandler();
        AbstractFileHandler spreadsheetHandler = new SpreadsheetFileHandler();
        AbstractFileHandler presentationHandler = new PresentationFileHandler();

        // Встановлюємо наступники у ланцюжку
        imageHandler.setNextHandler(documentHandler);
        documentHandler.setNextHandler(spreadsheetHandler);
        spreadsheetHandler.setNextHandler(presentationHandler);

        // Відкриваємо файли
        for (String file : files) {
            imageHandler.handleFile(file);
        }
    }
}