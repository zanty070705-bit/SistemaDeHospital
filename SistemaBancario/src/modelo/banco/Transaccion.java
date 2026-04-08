package modelo.banco;

import modelo.abstractas.Cuenta;
import modelo.enums.EstadoTransaccion;
import modelo.excepciones.EstadoTransaccionInvalido;

public class Transaccion {
    private EstadoTransaccion estado;

    public Transaccion(String id, Cuenta origen, Cuenta destino, double monto, String desc) {
        this.estado = EstadoTransaccion.PENDIENTE;
    }

    public void cambiarEstado(EstadoTransaccion nuevo) {
       
        if (this.estado == EstadoTransaccion.PENDIENTE && nuevo == EstadoTransaccion.REVERTIDA) {
            throw new EstadoTransaccionInvalido("No se puede revertir una transaccion pendiente");
        }
        this.estado = nuevo;
    }
}