/**
 * Стратегія додавання
 */
public class AdditionStrategy extends OperationStrategy {

    @Override
    public int performOperation(int a, int b) {
        int result = a + b;
        System.out.printf("%s + %s = %s%n", a, b, result);
        return result;
    }

}