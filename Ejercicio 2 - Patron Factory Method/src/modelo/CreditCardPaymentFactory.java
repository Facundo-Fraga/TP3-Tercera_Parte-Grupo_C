package modelo;

/**
 * Clase concreta que extiende PaymentFactory para crear instancias de CreditCardPayment.
 */

 public class CreditCardPaymentFactory extends PaymentFactory {

    /**
     * Implementación del método createPayment para devolver una instancia de CreditCardPayment.
     *
     * @return una nueva instancia de CreditCardPayment
     */
    
    @Override
    public Payment createPayment() {
        return new CreditCardPayment(null, null, null);
    }
}
