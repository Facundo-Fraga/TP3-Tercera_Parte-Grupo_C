package modelo;

/**
 * Clase que representa el pago mediante tarjeta de crédito.
 * Implementa la interfaz Payment para proporcionar una implementación específica
 * del procesamiento de pago con tarjeta de crédito.
 */

 public class CreditCardPayment implements Payment {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    /**
     * Constructor de la clase CreditCardPayment.
     *
     * @param cardNumber      el número de la tarjeta de crédito
     * @param cardHolderName  el nombre del titular de la tarjeta
     * @param expiryDate      la fecha de vencimiento de la tarjeta
     */
    
     public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }



    /**
     * Método que procesa el pago mediante tarjeta de crédito.
     * Imprime un mensaje indicando que se ha realizado el pago.
     */
    
     @Override
    public void processPayment(double cantidad) {
        System.out.println("Procesando pago con tarjeta de crédito para " + cardHolderName + " con número de tarjeta " + cardNumber);
    }

}
