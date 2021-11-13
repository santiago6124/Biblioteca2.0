import java.util.ArrayList;

public class Prestamo {

    private final String fechaDePrestamo;
    private final String fechaTentativaDevolucion;
    private final Cliente c;
    private final ArrayList<Publicacion> listaDePublicaciones;

    public Prestamo(String fechaDePrestamo, String fechaTentativaDevolucion, Cliente c) {
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaTentativaDevolucion = fechaTentativaDevolucion;
        this.c = c;
        listaDePublicaciones = new ArrayList<>();
    }

    void agregar(Publicacion p) {
        listaDePublicaciones.add(p);
        p.ContadorPrestamos();
    }



    Cliente getClientes() {
        return c;

    }

    public ArrayList<Publicacion> getPublications() {
        return listaDePublicaciones;
    }

    @Override
    public String toString() {
        return "fecha De Prestamo =" + fechaDePrestamo + ", fecha Tentativa de Devolucion =" + fechaTentativaDevolucion + ", cliente = " + c + ", lista=" + listaDePublicaciones + '}';
    }

}
