public class SubtractionHandler extends AbstractOperationHandler {
    @Override
    protected boolean canHandleOperation(String operator) {
        return operator.equals("-");
    }

    @Override
    protected void executeOperation(int operand1, int operand2, String operator) {
        int result = operand1 - operand2;
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}