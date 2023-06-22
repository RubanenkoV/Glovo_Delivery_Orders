/**
 * Стратегія множення
 */
public class MultiplicationStrategy extends OperationStrategy {

    @Override
    public int performOperation(int a, int b) {
        int result = a * b;
        System.out.printf("%s * %s = %s%n", a, b, result);
        return result;
    }

}