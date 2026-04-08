package modelo.personas;

import modelo.abstractas.Persona;
import modelo.interfaces.Notificable;
import modelo.interfaces.Auditable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClienteNatural extends Persona implements Notificable, Auditable {

    public ClienteNatural(String id, String nombre, String email, LocalDate fecha) {
        super(id, nombre, email, fecha);
    }

    // --- MÉTODOS OBLIGATORIOS DE PERSONA ---
    @Override
    public int calcularEdad() {
        // Implementación sencilla para cumplir con la clase abstracta
        return 25; 
    }

    @Override
    public String obtenerTipo() {
        return "CLIENTE_NATURAL";
    }

    // --- IMPLEMENTACIÓN DE NOTIFICABLE ---
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificando a cliente: " + mensaje);
    }

    @Override
    public String obtenerContacto() {
        return getEmail();
    }

    @Override
    public boolean aceptaNotificaciones() {
        return true;
    }

    // --- IMPLEMENTACIÓN DE AUDITABLE (Sin errores de acceso) ---
    @Override
    public void registrarModificacion(String usuario) {
        // Aquí podrías guardar quién modificó el cliente si fuera necesario
    }

    @Override
    public String obtenerUsuarioModificacion() {
        return "SISTEMA";
    }

    @Override
    public LocalDateTime obtenerFechaCreacion() {
        return LocalDateTime.now();
    }

    @Override
    public LocalDateTime obtenerUltimaModificacion() {
        return LocalDateTime.now();
    }
}