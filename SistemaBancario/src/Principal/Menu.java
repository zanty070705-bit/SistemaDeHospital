package principal;
import modelo.cuentas.*;
import modelo.personas.*;
import modelo.empleados.*;
import modelo.excepciones.*;
import modelo.enums.*;
import modelo.abstractas.*;
import java.time.LocalDate;

public class Menu {
    public static void main(String[] args) {
        System.out.println("SISTEMA BANCARIO");
        System.out.println("----------------");

        ClienteNatural cliente = new ClienteNatural("123", "Juan Perez", "juan@mail.com", LocalDate.of(1990, 5, 15));
        System.out.println("Escenario 1: Cliente registrado: " + cliente.getNombreCompleto());

        CuentaAhorros ahorro = new CuentaAhorros("AH-001", 500000, 0.05);
        System.out.println("Escenario 2: Cuenta creada con saldo: " + ahorro.getSaldo());

        Empleado[] empleados = new Empleado[2];
        empleados[0] = new Cajero("C01", "Ana Rios", "ana@mail.com", LocalDate.of(2000, 1, 1), 1200000, Turno.MAÑANA);
        empleados[1] = new GerenteSucursal("G01", "Luis Gomez", "luis@mail.com", LocalDate.of(1985, 6, 10), 3500000, "Sede Norte");

        System.out.println("Escenario 6: Nomina");
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombreCompleto() + " - Salario: " + emp.calcularSalario());
        }
        
        System.out.println("----------------");
        System.out.println("FIN DEL PROGRAMA");
    }
}