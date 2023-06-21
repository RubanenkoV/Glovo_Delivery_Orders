class PreWordDecorator extends PrintableString {
    private final String word;

    public PreWordDecorator(PrintableString printableString, String word) {
        super(printableString.getString());
        this.word = word;
    }

    @Override
    public String getString() {
        return word + " " + super.getString();
    }
}