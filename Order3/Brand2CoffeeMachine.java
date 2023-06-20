class Brand2CoffeeMachine implements CoffeeMachine {
    private static final double COST_ESPRESSO = 2.0;
    private static final double COST_AMERICANO = 2.5;
    private static final double COST_CAPPUCCINO = 3.0;
    private static final double COST_LATTE = 3.5;
    private static final double SERVICE_COST = 15.0;

    @Override
    public void brewCoffee(String coffeeType) {
        // Приготування кави за допомогою кавової машини Brand 2
        System.out.println("Brewing coffee using Brand 2 coffee machine.");

        // Код приготування кави для кожного типу напою
        switch (coffeeType) {
            case "Espresso":
                // Код для приготування Espresso
                System.out.println("Brewing Espresso...");
                break;
            case "Americano":
                // Код для приготування Americano
                System.out.println("Brewing Americano...");
                break;
            case "Cappuccino":
                // Код для приготування Cappuccino
                System.out.println("Brewing Cappuccino...");
                break;
            case "Latte":
                // Код для приготування Latte
                System.out.println("Brewing Latte...");
                break;
            default:
                System.out.println("Invalid coffee type.");
                break;
        }
    }

    @Override
    public double getCost(String coffeeType) {
        // Повернення вартості кави для кожного типу напою
        switch (coffeeType) {
            case "Espresso":
                return COST_ESPRESSO;
            case "Americano":
                return COST_AMERICANO;
            case "Cappuccino":
                return COST_CAPPUCCINO;
            case "Latte":
                return COST_LATTE;
            default:
                return 0.0;
        }
    }

    @Override
    public double getServiceCost() {
        return SERVICE_COST;
    }
}