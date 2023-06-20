import java.util.ArrayList;
import java.util.List;

class Cafe {
    private final List<Beverage> beverages;

    public Cafe() {
        beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public double calculateTotalProfit() {
        double totalProfit = 0.0;
        for (Beverage beverage : beverages) {
            totalProfit += beverage.calculateProfit();
        }
        return totalProfit;
    }
}