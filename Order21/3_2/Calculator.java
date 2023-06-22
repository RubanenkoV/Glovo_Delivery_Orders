public class Calculator {

    private OperationStrategy operationStrategy;

    /**
     * Встановлює стратегію арифметичної операції
     *
     * @param operationStrategy стратегія арифметичної операції
     */
    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    /**
     * Виконує арифметичну операцію залежно від поточної стратегії
     *
     * @param a перший операнд
     * @param b другий операнд
     * @return результат операції
     */
    public int performOperation(int a, int b) {
        if (operationStrategy != null) {
            return operationStrategy.performOperation(a, b);
        } else {
            System.out.println("Error: Operation strategy not set.");
            return 0;
        }
    }
}