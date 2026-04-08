package modelo.abstractas;
import java.time.LocalDate;

public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String email;
    protected LocalDate fechaNacimiento;

    public Persona(String id, String nombre, String email, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fecha;
    }

    public abstract int calcularEdad();
    public abstract String obtenerTipo();
    
    public String getNombreCompleto() { return nombre; }
    public String getEmail() { return email; }
    public String getId() { return id; }
}