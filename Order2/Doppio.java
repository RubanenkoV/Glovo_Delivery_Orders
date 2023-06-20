class Doppio extends Beverage {
    public Doppio() {
        super("Espresso", 2.5, 6);
    }

    @Override
    public double calculateProfit() {
        return sellingPrice - costPrice;
    }
}