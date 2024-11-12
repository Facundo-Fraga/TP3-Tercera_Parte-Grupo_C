package modelo;

/**
 * Clase concreta que extiende PaymentFactory para crear instancias de BankTransferPayment.
 */

 public class BankTransferPaymentFactory extends PaymentFactory {

    /**
     * Implementación del método createPayment para devolver una instancia de BankTransferPayment.
     *
     * @return una nueva instancia de BankTransferPayment
     */
    
    @Override
    public Payment createPayment() {
        return new BankTransferPayment(null);
    }
}
