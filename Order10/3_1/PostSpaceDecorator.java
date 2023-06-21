class PostSpaceDecorator extends PrintableString {
    public PostSpaceDecorator(PrintableString printableString) {
        super(printableString.getString() + " ");
    }
}