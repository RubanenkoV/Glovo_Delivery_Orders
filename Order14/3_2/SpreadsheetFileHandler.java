public class SpreadsheetFileHandler extends AbstractFileHandler {
    protected boolean canHandleFile(String fileName) {
        return fileName.endsWith(".xls") || fileName.endsWith(".xlsx");
    }

    protected void openFile(String fileName) {
        System.out.println("Opening spreadsheet file: " + fileName);
        // код для відкриття електронної таблиці
    }
}