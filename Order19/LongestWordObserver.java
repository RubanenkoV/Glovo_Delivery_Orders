class LongestWordObserver implements FileObserver {
    private String longestWord;

    public void update(String line) {
        if (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (longestWord == null || word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    }

    public void printLongestWord() {
        System.out.println("Longest word: " + longestWord);
    }
}