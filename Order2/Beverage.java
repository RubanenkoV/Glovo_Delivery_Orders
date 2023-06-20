abstract class Beverage {

    protected String name;
    protected double costPrice;
    protected double sellingPrice;

    public Beverage(String name, double costPrice, double sellingPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public abstract double calculateProfit();

    public String getName() {
        return name;
    }
}
