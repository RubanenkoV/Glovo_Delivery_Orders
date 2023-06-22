class WordCountObserver implements FileObserver {
    private int wordCount;

    public void update(String line) {
        if (line != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
    }

    public void printWordCount() {
        System.out.println("Word count: " + wordCount);
    }
}