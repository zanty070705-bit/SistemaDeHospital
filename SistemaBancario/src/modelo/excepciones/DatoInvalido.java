package modelo.excepciones;
public class DatoInvalido extends RunTime {
    private String campo;
    public DatoInvalido(String campo, Object valor) {
        super("Dato inválido en " + campo + ": " + valor);
        this.campo = campo;
    }
}