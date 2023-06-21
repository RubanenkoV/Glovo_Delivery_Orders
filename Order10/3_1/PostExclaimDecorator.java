class PostExclaimDecorator extends PrintableString {
    public PostExclaimDecorator(PrintableString printableString) {
        super(printableString.getString() + "!");
    }
}