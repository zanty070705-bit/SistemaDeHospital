package modelo.excepciones;
public class SaldoInsuficiente extends SistemaBancario {
    public SaldoInsuficiente(double saldo, double monto) {
        super("Saldo insuficiente para retirar " + monto);
    }
}