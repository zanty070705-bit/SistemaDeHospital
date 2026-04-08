package modelo.interfaces;
import modelo.excepciones.*;

public interface Transaccionable {
    void depositar(double monto) throws SistemaBancario;
    void retirar(double monto) throws SistemaBancario;
    double consultarSaldo();
    double calcularComision(double monto);
}
