public class PrintableString {
    private final String base;

    public PrintableString(String base) {
        this.base = base;
    }

    public String getString() {
        return base;
    }

    public void print() {
        System.out.print(base);
    }
}