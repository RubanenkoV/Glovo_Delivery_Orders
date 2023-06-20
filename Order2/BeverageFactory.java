class BeverageFactory {

    public static Beverage createBeverage(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "water":
                return new Water();
            case "doppio":
                return new Doppio();
            default:
                throw new IllegalArgumentException("Invalid beverage type: " + type);
        }
    }
}