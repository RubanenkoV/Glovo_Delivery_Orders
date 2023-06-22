public class DivisionHandler extends AbstractOperationHandler {
    @Override
    protected boolean canHandleOperation(String operator) {
        return operator.equals("/");
    }

    @Override
    protected void executeOperation(int operand1, int operand2, String operator) {
        if (operand2 != 0) {
            double result = (double) operand1 / operand2;
            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}