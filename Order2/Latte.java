class Latte extends Beverage {
    public Latte() {
        super("Latte", 3.5, 7.0);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}