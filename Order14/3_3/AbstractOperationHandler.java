public abstract class AbstractOperationHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOperation(int operand1, int operand2, String operator) {
        if (canHandleOperation(operator)) {
            executeOperation(operand1, operand2, operator);
        } else if (nextHandler != null) {
            nextHandler.handleOperation(operand1, operand2, operator);
        } else {
            System.out.println("Unsupported operation: " + operator);
        }
    }

    protected abstract boolean canHandleOperation(String operator);

    protected abstract void executeOperation(int operand1, int operand2, String operator);
}