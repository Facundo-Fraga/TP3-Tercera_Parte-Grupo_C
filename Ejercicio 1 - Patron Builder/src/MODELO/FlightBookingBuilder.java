package MODELO;

/**
 * Builder para crear una instancia de FlightBooking, permitiendo la configuración de las 
 * opciones de asiento, equipaje, comida y servicios premium.
 */
public class FlightBookingBuilder {
    Asiento asientoSeleccionado = Asiento.ECONOMICO;
    int cantidadEquipaje = 0;
    TipoComida tipoComida = TipoComida.BASICA;
    boolean serviciosPremium = false;

    /**
     * Establece el tipo de asiento seleccionado para la reserva.
     * 
     * @param asientoSeleccionado el tipo de asiento deseado
     * @return la instancia actual de FlightBookingBuilder para encadenar métodos
     */
    public FlightBookingBuilder setAsientoSeleccionado(Asiento asientoSeleccionado) {
        this.asientoSeleccionado = asientoSeleccionado;
        return this;
    }

    /**
     * Establece la cantidad de equipaje para la reserva.
     * 
     * @param cantidadEquipaje la cantidad de piezas de equipaje
     * @return la instancia actual de FlightBookingBuilder para encadenar métodos
     */
    public FlightBookingBuilder setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
        return this;
    }

    /**
     * Establece el tipo de comida seleccionado para la reserva.
     * 
     * @param tipoComida el tipo de comida deseado
     * @return la instancia actual de FlightBookingBuilder para encadenar métodos
     */
    public FlightBookingBuilder setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
        return this;
    }

    /**
     * Establece si se incluyen servicios premium en la reserva.
     * 
     * @param serviciosPremium true para incluir servicios premium, false de lo contrario
     * @return la instancia actual de FlightBookingBuilder para encadenar métodos
     */
    public FlightBookingBuilder setServiciosPremium(boolean serviciosPremium) {
        this.serviciosPremium = serviciosPremium;
        return this;
    }

    /**
     * Construye y devuelve una nueva instancia de FlightBooking basada en la configuración actual.
     * 
     * @return una instancia de FlightBooking con las opciones seleccionadas
     */
    public FlightBooking build() {
        return new FlightBooking(this);
    }
}

