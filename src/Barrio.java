public class Barrio {

    private final String nombre;
    private final Localidad localidad;

    public Barrio(String nombre, Localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;

    }

    @Override
    public String toString() {
        return "Barrio{" + "nombre=" + nombre + ", localidad=" + localidad + '}';
    }

}