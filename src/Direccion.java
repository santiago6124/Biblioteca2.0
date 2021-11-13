public class Direccion {

    private final String calle;
    private final Barrio b;
    private final String numero;

    public Direccion(String calle, String numero, Barrio b) {
        this.calle = calle;
        this.numero = numero;
        this.b = b;

    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", b=" + b + ", numero=" + numero + '}';
    }

    public Barrio getBarrio() {
        return b;
    }

}