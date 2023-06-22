public class Customer {

    private PaymentStrategy paymentStrategy;

    /**
     * Встановлює стратегію оплати
     *
     * @param paymentStrategy стратегія оплати
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Здійснює оплату за допомогою поточної стратегії
     *
     * @param amount сума для оплати
     */
    public void makePayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.makePayment(amount);
        } else {
            System.out.println("Error: Payment strategy not set.");
        }
    }

}