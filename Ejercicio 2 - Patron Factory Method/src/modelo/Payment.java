package modelo;

/**
 * Interfaz que define el método de pago.
 * Cada clase que implementa esta interfaz debe proporcionar
 * su propia implementación del método processPayment().
 */

 public interface Payment {

    /**
     * Método que procesa el pago.
     */

     void processPayment(double cantidad);

}
