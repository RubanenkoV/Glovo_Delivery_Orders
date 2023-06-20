public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // Додавання початкових напоїв
        cafe.addBeverage(BeverageFactory.createBeverage("espresso"));
        cafe.addBeverage(BeverageFactory.createBeverage("americano"));
        cafe.addBeverage(BeverageFactory.createBeverage("cappuccino"));
        cafe.addBeverage(BeverageFactory.createBeverage("latte"));
        cafe.addBeverage(BeverageFactory.createBeverage("water"));
        cafe.addBeverage(BeverageFactory.createBeverage("doppio"));


        // Додавання нових напоїв
        cafe.addBeverage(BeverageFactory.createBeverage("mocha"));
        cafe.addBeverage(BeverageFactory.createBeverage("macchiato"));

        double totalProfit = cafe.calculateTotalProfit();
        System.out.println("Total profit: $" + totalProfit);
    }
}