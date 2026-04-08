package modelo.cuentas;

import modelo.abstractas.Cuenta;
import modelo.interfaces.Transaccionable;
import modelo.excepciones.*;

public class CuentaAhorros extends Cuenta implements Transaccionable {
    private final double tasaInteres;

    public CuentaAhorros(String numero, double saldo, double tasa) {
        super(numero, saldo);
        this.tasaInteres = tasa;
    }

    
    @Override
    public void depositar(double monto) throws SistemaBancario {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public void retirar(double monto) throws SistemaBancario {
        if (monto > getSaldo()) {
            throw new SaldoInsuficiente(getSaldo(), monto);
        }
        setSaldo(getSaldo() - monto);
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    @Override
    public double calcularComision(double monto) {
        return 0; 
    }

    
    @Override
    public double calcularInteres() {
        return getSaldo() * tasaInteres;
    }

    @Override
    public String getTipoCuenta() {
        return "AHORROS";
    }

    public double getLimiteRetiro() {
        return 2000000; 
    }
}