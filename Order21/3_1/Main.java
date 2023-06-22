public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();

        // Встановлюємо стратегію оплати з банківського рахунку
        PaymentStrategy bankAccountPaymentStrategy = new BankAccountPaymentStrategy();
        customer.setPaymentStrategy(bankAccountPaymentStrategy);

        // Здійснюємо оплату
        customer.makePayment(100);

        // Встановлюємо стратегію оплати через PayPal
        PaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
        customer.setPaymentStrategy(payPalPaymentStrategy);

        // Здійснюємо оплату
        customer.makePayment(200);
    }

}