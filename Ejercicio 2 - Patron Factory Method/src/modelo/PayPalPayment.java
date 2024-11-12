package modelo;

/**
 * Clase que representa el pago mediante PayPal.
 * Implementa la interfaz Payment para proporcionar una implementación específica
 * del procesamiento de pago con PayPal.
 */

 public class PayPalPayment implements Payment {

    private String email;

    /**
     * Constructor de la clase PayPalPayment.
     *
     * @param email el correo electrónico asociado a la cuenta de PayPal
     */
    
     public PayPalPayment(String email) {
        this.email = email;
    }
    
    /**
     * Método que procesa el pago mediante PayPal.
     * Imprime un mensaje indicando que se ha realizado el pago.
     */
    
     @Override
    public void processPayment(double cantidad) {
        System.out.println("Procesando pago con PayPal para la cuenta de correo: " + email);
    }

}
