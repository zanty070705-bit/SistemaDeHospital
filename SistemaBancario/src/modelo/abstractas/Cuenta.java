package modelo.abstractas;
import modelo.interfaces.Auditable;
import java.time.LocalDateTime;

public abstract class Cuenta implements Auditable {
    private String numero;
    private double saldo;
    private String usuarioModificacion;

    public Cuenta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public abstract double calcularInteres();
    public abstract String getTipoCuenta();

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public String getNumero() { return numero; }

    @Override
    public void registrarModificacion(String u) { this.usuarioModificacion = u; }
    @Override
    public String obtenerUsuarioModificacion() { return usuarioModificacion; }
    @Override
    public LocalDateTime obtenerFechaCreacion() { return LocalDateTime.now(); }
    @Override
    public LocalDateTime obtenerUltimaModificacion() { return LocalDateTime.now(); }
}