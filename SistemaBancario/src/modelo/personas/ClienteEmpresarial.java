package modelo.personas;

import modelo.abstractas.Persona;
import modelo.interfaces.Notificable;
import modelo.interfaces.Auditable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClienteEmpresarial extends Persona implements Notificable, Auditable {

    private String nit;
    private String razonSocial;

    public ClienteEmpresarial(String id, String nombre, String email, LocalDate fecha, String nit, String razonSocial) {
        super(id, nombre, email, fecha);
        this.nit = nit;
        this.razonSocial = razonSocial;
    }

   
    @Override
    public int calcularEdad() {
        return 0; 
    }

    @Override
    public String obtenerTipo() {
        return "CLIENTE_EMPRESARIAL";
    }

   
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando correo corporativo a " + razonSocial + ": " + mensaje);
    }

    @Override
    public String obtenerContacto() {
        return getEmail(); 
    }

    @Override
    public boolean aceptaNotificaciones() {
        return true;
    }

   
    @Override
    public void registrarModificacion(String usuario) {
       
    }

    @Override
    public String obtenerUsuarioModificacion() {
        return "SISTEMA_CORP";
    }

    @Override
    public LocalDateTime obtenerFechaCreacion() {
        return LocalDateTime.now();
    }

    @Override
    public LocalDateTime obtenerUltimaModificacion() {
        return LocalDateTime.now();
    }

   
    public String getNit() { return nit; }
    public String getRazonSocial() { return razonSocial; }
}
