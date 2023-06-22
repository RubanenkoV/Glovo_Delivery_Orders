/**
 * Абстрактний клас для стратегії арифметичної операції
 */
public abstract class OperationStrategy {

    /**
     * Виконує арифметичну операцію над двома операндами
     *
     * @param a перший операнд
     * @param b другий операнд
     * @return результат операції
     */
    public abstract int performOperation(int a, int b);

}