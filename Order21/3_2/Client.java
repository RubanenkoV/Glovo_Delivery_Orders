public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Встановлюємо стратегію додавання
        OperationStrategy additionStrategy = new AdditionStrategy();
        calculator.setOperationStrategy(additionStrategy);

        // Виконуємо операцію додавання
        calculator.performOperation(5, 3);

        // Встановлюємо стратегію віднімання
        OperationStrategy subtractionStrategy = new SubtractionStrategy();
        calculator.setOperationStrategy(subtractionStrategy);

        // Виконуємо операцію віднімання
        calculator.performOperation(10, 4);

        // Встановлюємо стратегію множення
        OperationStrategy multiplicationStrategy = new MultiplicationStrategy();
        calculator.setOperationStrategy(multiplicationStrategy);

        // Виконуємо операцію множення
        calculator.performOperation(7, 2);
    }

}