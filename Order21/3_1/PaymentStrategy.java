public abstract class PaymentStrategy {

    /**
     * Метод оплати
     *
     * @param amount сума для оплати
     */
    public abstract void makePayment(int amount);

}