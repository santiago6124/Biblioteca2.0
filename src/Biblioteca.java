import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final ArrayList<Publicacion> listadepublicaciones;
    private final ArrayList<Prestamo> listadeprestamos;
    private final ArrayList ListaDeClientesALosQueSeLesPrestoUnLibro;
    private final ArrayList<Publicacion> list_publicaciones;
    int CantidadDeLibros = 0;
    int CantidadDeRevistas = 0;

    private final String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        list_publicaciones = new ArrayList();
        listadepublicaciones = new ArrayList<>();
        listadeprestamos = new ArrayList<>();
        ListaDeClientesALosQueSeLesPrestoUnLibro = new ArrayList<>();
    }

    public List<Cliente> GetClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
        for (Prestamo p : listadeprestamos) {
            clientes.add(p.getClientes());
        }
        return clientes;
    }

    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<Libro>();
        for (Publicacion p : listadepublicaciones) {
            if (p instanceof Libro) {
                libros.add((Libro) p);
            }
        }
        return libros;
    }


    public List<Revista> getRevistas() {
        List<Revista> revistas = new ArrayList<Revista>();
        for (Publicacion p : listadepublicaciones) {
            if (p instanceof Revista) {
                revistas.add((Revista) p);
            }
        }
        return revistas;
    }

    public int getCantidadDeLibros() {
        return CantidadDeLibros;
    }


    public int getCantidadDeRevistas() {
        return CantidadDeRevistas;
    }

    public int getCantidadDePublicaciiones() {
        return listadepublicaciones.size();
    }

    public String getNombre() {
        return nombre;
    }

    void prestar(Prestamo p) {
        listadeprestamos.add(p);
    }

    void agregar(Publicacion p) {
        listadepublicaciones.add(p);
    }

    int cantidaddeprestamos() {
        return listadeprestamos.size();
    }

    public List<Prestamo> getPrestamos() {
        return listadeprestamos;
    }

    void CantidadDePublicacionesEnBiblioteca() {
        for (Publicacion p : listadepublicaciones) {
            if (p instanceof Libro) {
                CantidadDeLibros++;
            } else {
                CantidadDeRevistas++;
            }
        }
        System.out.println("Libros " + CantidadDeLibros);
        System.out.println("Revistas " + CantidadDeRevistas);
    }

    int CantidadDePublicaciiones() {
        return listadepublicaciones.size();
    }

    void ListadoDePublicaciones() {
        for (Publicacion p : listadepublicaciones) {
            System.out.println(p.pGetTitulo());

        }

    }

    void listadoDePrestamos() {
        for (Prestamo p : listadeprestamos) {
            System.out.println(p);
        }
    }

    void listaClientesLibro() {
        for (Prestamo p : listadeprestamos) {
            for (Publicacion publicacion : p.getPublications()) {
                if (publicacion instanceof Libro) {
                    System.out.println(p.getClientes());
                }
            }
        }

    }

    public List listaClientesPub() {
        List<Publicacion> publicaciones = new ArrayList<Publicacion>();
        for (Prestamo p : listadeprestamos) {
            for (Publicacion publicacion : p.getPublications()) {
                if (publicacion instanceof Publicacion) {
                    publicaciones.add(publicacion);
                }
            }
        }
        return publicaciones;
    }

    public ArrayList<Publicacion> getListadepublicaciones() {
        return listadepublicaciones;
    }

    void listaDoDeBarrios() {
        for (Prestamo p : listadeprestamos) {
            for (Publicacion publicacion : p.getPublications()) {
                System.out.println(p.getClientes().getDireccion().getBarrio());
            }
        }
    }

}