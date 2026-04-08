package modelo.excepciones;

public class EstadoTransaccionInvalido extends RuntimeException {
    

    public EstadoTransaccionInvalido(String mensaje) {
        super(mensaje);
    }

   
    public EstadoTransaccionInvalido(String actual, String intento) {
        super("Transicion de estado no permitida de " + actual + " a " + intento);
    }
}
