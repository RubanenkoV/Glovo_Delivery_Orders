import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileReaderHandler {
    private final String filePath;
    private final List<FileObserver> observers;

    public FileReaderHandler(String filePath) {
        this.filePath = filePath;
        this.observers = new ArrayList<>();

        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void addObserver(FileObserver observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                notifyObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        notifyObservers(null); // Signal end of file
    }

    private void notifyObservers(String line) {
        for (FileObserver observer : observers) {
            observer.update(line);
        }
    }
}