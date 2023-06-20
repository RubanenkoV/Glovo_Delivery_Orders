class Brand2CoffeeMachineFactory extends CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new Brand2CoffeeMachine();
    }
}
