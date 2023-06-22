public interface OperationHandler {
    void setNextHandler(OperationHandler nextHandler);
    void handleOperation(int operand1, int operand2, String operator);
}