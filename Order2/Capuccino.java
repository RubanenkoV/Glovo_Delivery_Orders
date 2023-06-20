class Cappuccino extends Beverage {
    public Cappuccino() {
        super("Cappuccino", 3.0, 6.0);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}