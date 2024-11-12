package modelo;

/**
 * Clase concreta que extiende PaymentFactory para crear instancias de PayPalPayment.
 */
public class PayPalPaymentFactory extends PaymentFactory {

    /**
     * Implementación del método createPayment para devolver una instancia de PayPalPayment.
     *
     * @return una nueva instancia de PayPalPayment
     */
    @Override
    public Payment createPayment() {
        return new PayPalPayment(null);
    }
}
