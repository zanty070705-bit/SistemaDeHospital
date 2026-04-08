package modelo.empleados;
import modelo.abstractas.Empleado;
import modelo.enums.Turno;
import java.time.LocalDate;

public class Cajero extends Empleado {
    public Cajero(String id, String nombre, String email, LocalDate birth, double salario, Turno turno) {
        super(id, nombre, email, birth, salario, LocalDate.now());
    }
    @Override public double calcularSalario() { return getSalarioBase() + 100000; }
    @Override public double calcularBono() { return 100000; }
    @Override public int calcularEdad() { return 30; }
    @Override public String obtenerTipo() { return "CAJERO"; }
}