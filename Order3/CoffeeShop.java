public class CoffeeShop {
    public static void main(String[] args) {
        // Параметри кавової машини Brand 1
        int brand1MachineCount = 2;
        double brand1MachineCost = 500.0;

        // Параметри кавової машини Brand 2
        int brand2MachineCount = 3;
        double brand2MachineCost = 600.0;

        // Кількість днів
        int numDays = 30;

        // Створення фабрик для кожного виробника кавових машин
        CoffeeMachineFactory brand1Factory = new Brand1CoffeeMachineFactory();
        CoffeeMachineFactory brand2Factory = new Brand2CoffeeMachineFactory();

        // Розрахунок прибутку для кожного виробника кавових машин протягом N днів
        double brand1Profit = calculateProfit(brand1Factory, brand1MachineCount, brand1MachineCost, numDays);
        double brand2Profit = calculateProfit(brand2Factory, brand2MachineCount, brand2MachineCost, numDays);

        // Виведення результатів
        System.out.println("Profit for Brand 1 coffee machines: $" + brand1Profit);
        System.out.println("Profit for Brand 2 coffee machines: $" + brand2Profit);

        // Визначення оптимального варіанту
        if (brand1Profit > brand2Profit) {
            System.out.println("Brand 1 coffee machines are more profitable.");
        } else if (brand2Profit > brand1Profit) {
            System.out.println("Brand 2 coffee machines are more profitable.");
        } else {
            System.out.println("Both options have the same profit.");
        }
    }

    public static double calculateProfit(
            CoffeeMachineFactory factory,
            int machineCount,
            double machineCost,
            int numDays
    ) {
        double totalProfit = 0.0;
        double totalServiceCost = 0.0;

        // Створення кавових машин
        CoffeeMachine coffeeMachine = factory.createCoffeeMachine();

        // Розрахунок прибутку протягом N днів
        for (int i = 0; i < numDays; i++) {
            // Приготування та продаж кави
            coffeeMachine.brewCoffee("Espresso");
            double espressoCost = coffeeMachine.getCost("Espresso");
            totalProfit += espressoCost;

            // Обслуговування кавової машини
            totalServiceCost += coffeeMachine.getServiceCost();
        }

        // Розрахунок загального прибутку (враховуючи вартість кавових машин та обслуговування)
        double totalCost = (machineCount * machineCost) + totalServiceCost;

        return totalProfit - totalCost;
    }
}