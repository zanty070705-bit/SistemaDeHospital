package modelo.abstractas;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado extends Persona {
    private double salarioBase;
    private LocalDate fechaContratacion;

    public Empleado(String id, String nombre, String email, LocalDate birth, double salario, LocalDate contratacion) {
        super(id, nombre, email, birth);
        this.salarioBase = salario;
        this.fechaContratacion = contratacion;
    }

    public abstract double calcularSalario();
    public abstract double calcularBono();
    public double getSalarioBase() { return salarioBase; }
    public int calcularAntigüedad() {
        return Period.between(fechaContratacion, LocalDate.now()).getYears();
    }
}