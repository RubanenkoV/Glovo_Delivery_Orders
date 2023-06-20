class Water extends Beverage {
    public Water() {
        super("Water", 1, 2);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}