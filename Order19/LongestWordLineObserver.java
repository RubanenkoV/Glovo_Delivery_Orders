class LongestWordLineObserver implements FileObserver {
    private String longestWordLine;

    public void update(String line) {
        if (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (longestWordLine == null || word.length() > longestWordLine.length()) {
                    longestWordLine = line;
                }
            }
        }
    }

    public void printLongestWordLine() {
        System.out.println("Line with longest word: " + longestWordLine);
    }
}