public abstract class AbstractFileHandler implements FileHandler {
    private FileHandler nextHandler;

    public void setNextHandler(FileHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleFile(String fileName) {
        if (canHandleFile(fileName)) {
            openFile(fileName);
        } else if (nextHandler != null) {
            nextHandler.handleFile(fileName);
        } else {
            System.out.println("Cannot open file: " + fileName);
        }
    }

    protected abstract boolean canHandleFile(String fileName);

    protected abstract void openFile(String fileName);
}