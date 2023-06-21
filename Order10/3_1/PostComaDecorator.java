class PostComaDecorator extends PrintableString {
    public PostComaDecorator(PrintableString printableString) {
        super(printableString.getString() + ",");
    }
}