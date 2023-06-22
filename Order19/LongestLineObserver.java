class LongestLineObserver implements FileObserver {
    private String longestLine;

    public void update(String line) {
        if (line != null && (longestLine == null || line.length() > longestLine.length())) {
            longestLine = line;
        }
    }

    public void printLongestLine() {
        System.out.println("Longest line: " + longestLine);
    }
}