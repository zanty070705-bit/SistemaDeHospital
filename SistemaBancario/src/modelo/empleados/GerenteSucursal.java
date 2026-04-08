package modelo.empleados;
import modelo.abstractas.Empleado;
import java.time.LocalDate;

public class GerenteSucursal extends Empleado {
    public GerenteSucursal(String id, String nombre, String email, LocalDate birth, double salario, String sede) {
        super(id, nombre, email, birth, salario, LocalDate.now());
    }
    @Override public double calcularSalario() { return getSalarioBase() + 500000; }
    @Override public double calcularBono() { return 500000; }
    @Override public int calcularEdad() { return 45; }
    @Override public String obtenerTipo() { return "GERENTE"; }
}