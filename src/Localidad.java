public class Localidad {

    private final String nombre;
    private final Provincia prov;

    Localidad(String nombre, Provincia prov) {
        this.nombre = nombre;
        this.prov = prov;

    }

    @Override
    public String toString() {
        return "Localidad{" + "nombre=" + nombre + ", prov=" + prov + '}';
    }

}