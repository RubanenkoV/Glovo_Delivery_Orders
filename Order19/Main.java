public class Main {

    public static void main(String[] args) {
        String filePath = "src/input01.txt";

        FileReaderHandler fileReader = new FileReaderHandler(filePath);

        LongestLineObserver longestLineObserver = new LongestLineObserver();
        LongestWordObserver longestWordObserver = new LongestWordObserver();
        WordCountObserver wordCountObserver = new WordCountObserver();
        LongestWordLineObserver longestWordLineObserver = new LongestWordLineObserver();

        fileReader.addObserver(longestLineObserver);
        fileReader.addObserver(longestWordObserver);
        fileReader.addObserver(wordCountObserver);
        fileReader.addObserver(longestWordLineObserver);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        longestLineObserver.printLongestLine();
        longestWordObserver.printLongestWord();
        wordCountObserver.printWordCount();
        longestWordLineObserver.printLongestWordLine();
    }
}