class Espresso extends Beverage {
    public Espresso() {
        super("Espresso", 2.0, 4.5);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}