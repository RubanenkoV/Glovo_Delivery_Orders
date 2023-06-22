public class Client {
    public static void main(String[] args) {
        // Створення обробників
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        // Встановлення наступників у ланцюжку
        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);

        // Обробка запитів
        additionHandler.handleOperation(5, 3, "+");
        subtractionHandler.handleOperation(10, 4, "-");
        multiplicationHandler.handleOperation(6, 2, "*");
        divisionHandler.handleOperation(12, 0, "/");
        additionHandler.handleOperation(8, 2, "%");
    }
}