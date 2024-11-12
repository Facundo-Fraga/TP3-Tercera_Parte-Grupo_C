import modelo.*;

/**
 * Clase principal para probar la implementación del patrón Factory Method.
 */
public class App {
    public static void main(String[] args) {
        // Instancia de la fábrica de pago con tarjeta de crédito
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment(150.00);

        // Instancia de la fábrica de pago con PayPal
        PaymentFactory paypalFactory = new PayPalPaymentFactory();
        Payment paypalPayment = paypalFactory.createPayment();
        paypalPayment.processPayment(200.50);

        // Instancia de la fábrica de pago con transferencia bancaria
        PaymentFactory bankTransferFactory = new BankTransferPaymentFactory();
        Payment bankTransferPayment = bankTransferFactory.createPayment();
        bankTransferPayment.processPayment(500.75);
    }
}
