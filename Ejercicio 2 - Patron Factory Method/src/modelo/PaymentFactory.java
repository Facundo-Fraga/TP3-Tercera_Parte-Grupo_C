package modelo;

/**
 * Clase abstracta que define el método de fábrica para la creación de objetos de tipo Payment.
 * Las subclases deben implementar el método createPayment() para devolver instancias específicas
 * de métodos de pago.
 */

public abstract class PaymentFactory {

    /**
     * Método abstracto para la creación de un objeto de tipo Payment.
     * Las subclases concretas deben implementar este método para devolver
     * la instancia específica del método de pago.
     *
     * @return un objeto de tipo Payment
     */
    
     public abstract Payment createPayment();
}
