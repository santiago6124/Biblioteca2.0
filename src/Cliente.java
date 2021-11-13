import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private final String nombre;
    private final String telefono;
    private final String mail;
    private final Direccion d;

    public Cliente(String nombre, String telefono, String mail, Direccion d) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.d = d;

    }

    @Override
    public String toString() {
        return nombre;
    }

    public Direccion getDireccion() {
        return d;
    }

    public String getNombre() {
        return nombre;
    }
}


