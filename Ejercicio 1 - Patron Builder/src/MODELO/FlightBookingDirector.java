package MODELO;


/**
 * Director opcional para crear configuraciones predefinidas de FlightBooking, como 
 * reservas económicas, de negocios o VIP.
 */
public class FlightBookingDirector {
    private final FlightBookingBuilder builder;

    /**
     * Crea una nueva instancia de FlightBookingDirector con el builder especificado.
     * 
     * @param builder el builder utilizado para construir las reservas
     */
    public FlightBookingDirector(FlightBookingBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye y devuelve una reserva económica con opciones predefinidas.
     * 
     * @return una instancia de FlightBooking con configuración económica
     */
    public FlightBooking realizarReservaEconomica() {
        return builder
            .setAsientoSeleccionado(Asiento.ECONOMICO)
            .setCantidadEquipaje(1)
            .setTipoComida(TipoComida.BASICA)
            .setServiciosPremium(false)
            .build();
    }

    /**
     * Construye y devuelve una reserva business con opciones predefinidas.
     * 
     * @return una instancia de FlightBooking con configuración de negocios
     */
    public FlightBooking realizarReservaBusiness() {
        return builder
            .setAsientoSeleccionado(Asiento.BUSINESS)
            .setCantidadEquipaje(2)
            .setTipoComida(TipoComida.GOURMET)
            .setServiciosPremium(true)
            .build();
    }

}
