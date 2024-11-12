import MODELO.*;
/**
 * Programa principal para probar el sistema de reservas de vuelos usando el patrón Builder.
 */
public class App {
    public static void main(String[] args) {
        // Creo una reserva personalizada directamente con el builder
        FlightBooking booking1 = new FlightBookingBuilder()
            .setAsientoSeleccionado(Asiento.BUSINESS)
            .setCantidadEquipaje(3)
            .setTipoComida(TipoComida.GOURMET)
            .setServiciosPremium(false)
            .build();

        System.out.println(booking1);

        // Creo una reserva econmica utilizando el director
        FlightBookingBuilder builderEconomico = new FlightBookingBuilder();
        FlightBookingDirector directorEconomico = new FlightBookingDirector(builderEconomico);

        FlightBooking booking2 = directorEconomico.realizarReservaEconomica();
        System.out.println(booking2);

         // Creo una reserva business utilizando el director 
         FlightBookingBuilder builderBusiness = new FlightBookingBuilder();
         FlightBookingDirector directorBusiness = new FlightBookingDirector(builderBusiness);
 
         FlightBooking booking3 = directorBusiness.realizarReservaBusiness();
         System.out.println(booking3);
    }
}

