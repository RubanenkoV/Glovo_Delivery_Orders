class PostEndlDecorator extends PrintableString {
    public PostEndlDecorator(PrintableString printableString) {
        super(printableString.getString() + System.lineSeparator());
    }
}