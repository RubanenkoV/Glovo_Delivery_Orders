class Brand1CoffeeMachineFactory extends CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new Brand1CoffeeMachine();
    }
}