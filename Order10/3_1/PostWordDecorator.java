class PostWordDecorator extends PrintableString {
    private final String word;

    public PostWordDecorator(PrintableString printableString, String word) {
        super(printableString.getString());
        this.word = word;
    }

    @Override
    public String getString() {
        return super.getString() + " " + word;
    }
}