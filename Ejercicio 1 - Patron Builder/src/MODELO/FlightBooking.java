package MODELO;

/**
 * Representa una reserva de vuelo con opciones personalizadas como asiento, 
 * cantidad de equipaje, tipo de comida y servicios premium.
 */
public class FlightBooking {
    private final Asiento asientoSeleccionado;
    private final int cantidadEquipaje;
    private final TipoComida tipoComida;
    private final boolean serviciosPremium;

    /**
     * Constructor privado utilizado por el builder para crear una instancia de FlightBooking.
     * 
     * @param builder el builder que contiene los valores configurados para esta reserva
     */
    FlightBooking(FlightBookingBuilder builder) {
        this.asientoSeleccionado = builder.asientoSeleccionado;
        this.cantidadEquipaje = builder.cantidadEquipaje;
        this.tipoComida = builder.tipoComida;
        this.serviciosPremium = builder.serviciosPremium;
    }

    /**
     * @return el asiento seleccionado para la reserva
     */
    public Asiento getAsientoSeleccionado() {
        return asientoSeleccionado;
    }

    /**
     * @return la cantidad de equipaje permitida para la reserva
     */
    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    /**
     * @return el tipo de comida seleccionado para la reserva
     */
    public TipoComida getTipoComida() {
        return tipoComida;
    }

    /**
     * @return true si se han seleccionado servicios premium, false de lo contrario
     */
    public boolean tieneServiciosPremium() {
        return serviciosPremium;
    }

    @Override
    public String toString() {
        return "FlightBooking {" +
               "asientoSeleccionado=" + asientoSeleccionado +
               ", cantidadEquipaje=" + cantidadEquipaje +
               ", tipoComida=" + tipoComida +
               ", serviciosPremium=" + serviciosPremium +
               '}';
    }
}
