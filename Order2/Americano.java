class Americano extends Beverage {
    public Americano() {
        super("Americano", 2.5, 5.0);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}