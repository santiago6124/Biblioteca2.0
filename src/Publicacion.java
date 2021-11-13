public abstract class Publicacion {

    private int CantidadDePrestamos;
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;
    private final Categoria categoria;

    public Publicacion(String nombre, Autor autor, Editorial editorial, Categoria categoria) {
        this.titulo = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public void ContadorPrestamos() {
        CantidadDePrestamos++;
    }

    public String pGetTitulo() {
        return titulo;
    }

    public Autor pGetAutor() {
        return autor;
    }

    public Categoria pGetCategoria() {
        return categoria;
    }

    public Editorial pGetEditorial() {
        return editorial;
    }


    @Override
    public String toString() {
        return "titulo: " +  titulo + ", Autor: " + autor + ", Editorial: " + editorial + ", Caregoría: " + categoria;
    }

}
