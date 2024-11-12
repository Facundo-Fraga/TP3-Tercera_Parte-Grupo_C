# Sistema de gestión de pagos

## Diagrama de Clase

```mermaid
classDiagram
    class Payment {
        <<interface>>
        +processPayment() void
    }
    
    class CreditCardPayment {
        +processPayment() void
    }
    class PayPalPayment {
        +processPayment() void
    }
    class BankTransferPayment {
        +processPayment() void
    }
    
    Payment <|.. CreditCardPayment
    Payment <|.. PayPalPayment
    Payment <|.. BankTransferPayment
    
    class PaymentFactory {
        <<abstract>>
        +createPayment() Payment
    }
    
    class CreditCardPaymentFactory {
        +createPayment() Payment
    }
    class PayPalPaymentFactory {
        +createPayment() Payment
    }
    class BankTransferPaymentFactory {
        +createPayment() Payment
    }
    
    PaymentFactory <|-- CreditCardPaymentFactory
    PaymentFactory <|-- PayPalPaymentFactory
    PaymentFactory <|-- BankTransferPaymentFactory
    
    CreditCardPaymentFactory ..> CreditCardPayment : creates
    PayPalPaymentFactory ..> PayPalPayment : creates
    BankTransferPaymentFactory ..> BankTransferPayment : creates
```

### Explicación de cada clase

- **`Payment` (interfaz)**: Define el contrato que todas las clases de métodos de pago deben seguir.
- **Clases concretas de métodos de pago (`CreditCardPayment`, `PayPalPayment`, `BankTransferPayment`)**: Implementan la interfaz `Payment` y proporcionan la funcionalidad para procesar el pago.
- **`PaymentFactory` (clase abstracta)**: Proporciona un método `createPayment()` que es sobrescrito por las clases concretas.
- **Clases concretas de fábrica (`CreditCardPaymentFactory`, `PayPalPaymentFactory`, `BankTransferPaymentFactory`)**: Implementan el método `createPayment()` para retornar instancias de la clase de pago correspondiente.
