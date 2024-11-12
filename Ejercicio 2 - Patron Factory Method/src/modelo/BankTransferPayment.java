package modelo;

/**
 * Clase que representa el pago mediante transferencia bancaria.
 * Implementa la interfaz Payment para proporcionar una implementación específica
 * del procesamiento de pago con transferencia bancaria.
 */

 public class BankTransferPayment implements Payment {

    private String bankAccountNumber;

    /**
     * Constructor de la clase BankTransferPayment.
     *
     * @param bankAccountNumber el número de cuenta bancaria desde la que se realizará el pago
     */
    
     public BankTransferPayment(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Método que procesa el pago mediante transferencia bancaria.
     * Imprime un mensaje indicando que se ha realizado el pago.
     */

    @Override
    public void processPayment(double cantidad) {
        System.out.println("Procesando pago mediante transferencia bancaria desde la cuenta: " + bankAccountNumber);
    }

}
