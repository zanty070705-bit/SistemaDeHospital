package modelo.cuentas;

import modelo.abstractas.Cuenta;
import modelo.interfaces.Transaccionable;
import modelo.excepciones.*;

public class CuentaCorriente extends Cuenta implements Transaccionable {
    private final double sobregiro;

    public CuentaCorriente(String numero, double saldo, double sobregiro) {
        super(numero, saldo);
        this.sobregiro = sobregiro;
    }

   
    @Override
    public void depositar(double monto) throws SistemaBancario {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public void retirar(double monto) throws SistemaBancario {
        // Puede retirar hasta saldo + sobregiro
        if (monto > (getSaldo() + sobregiro)) {
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
        return monto * 0.01;
    }

    
    @Override
    public double calcularInteres() {
        return 0; 
    }

    @Override
    public String getTipoCuenta() {
        return "CORRIENTE";
    }

    public double getLimiteRetiro() {
        return 10000000; 
    }
}