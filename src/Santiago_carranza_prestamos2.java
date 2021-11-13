public class Santiago_carranza_prestamos2 {
    public static void main(String[] args) {
        Provincia prov = new Provincia("Cordoba");

        Localidad loc1 = new Localidad("Capital", prov);

        Barrio b1 = new Barrio("Valle Escondido", loc1);

        Direccion d1 = new Direccion("Av.San Martín", " 2324", b1);

        Provincia prov2 = new Provincia("Chaco");

        Localidad loc2 = new Localidad("Capital", prov2);

        Barrio b2 = new Barrio("Villa Tachito", loc2);

        Direccion d2 = new Direccion("Rosas", " 1578", b2);

        Cliente c1 = new Cliente("Santiago Carranza", "3513333333", "santiagocarranzazinny@gmail.com", d1);

        Cliente c2 = new Cliente("Tom Hiddleston", "78945357845", "tomddleston@gmail.com", d2);
        Autor a1 = new Autor("J.K Rowling");

        Categoria cat1 = new Categoria("Fantasia");

        Editorial e1 = new Editorial("La salamandra");

        Autor a2 = new Autor("David Churbuk");

        Categoria cat2 = new Categoria("Economía");

        Editorial e2 = new Editorial("Steve Forbes");

        Publicacion lib1 = new Libro("Harry potter", a1, cat1, e1);
        Publicacion lib2 = new Libro("Fahrenheit 451", a1, cat1, e1);

        Publicacion rev2 = new Revista("Forbes", a2, cat2, e2);
        Biblioteca bib = new Biblioteca("Biblioteca de la UNC");
        Prestamo pres1 = new Prestamo("16/06/2021", "04/07/2021", c1);
        pres1.agregar(lib1);
        //bib.agregarCliente(c1);

        Prestamo pres2 = new Prestamo("19/06/2021", "07/07/2021", c2);
        pres2.agregar(rev2);
        //bib.agregarCliente(c2);

        bib.agregar(lib1);
        bib.agregar(lib2);
        bib.agregar(rev2);

        bib.prestar(pres1);
        bib.prestar(pres2);

        System.out.println("Cantidad de prestamos:" + bib.cantidaddeprestamos() + "\n");
        System.out.println("cantidad de libros y revistas que posee la biblioteca" + "\n");
        bib.CantidadDePublicacionesEnBiblioteca();
        System.out.println();
        System.out.println("cantidad total de publicaciones " + bib.CantidadDePublicaciiones() + "\n");
        System.out.println("Listado de publicaciones de la biblioteca" + "\n");
        bib.ListadoDePublicaciones();
        System.out.println();
        System.out.println("Listado de prestamos " + "\n");
        bib.listadoDePrestamos();
        System.out.println();
        System.out.println("Listado de clientes a los que se les prestó un libro " + "\n");
        bib.listaClientesLibro();
        System.out.println();
        System.out.println("Listado de barrios de los clientes que han pedido prestado alguna publicación" + "\n");
        bib.listaDoDeBarrios();

        System.out.println("dasdasdas" + bib.getLibros());
        System.out.println("dasdasdas" + bib.getRevistas());

        new pwindow(bib).setVisible(true);

        System.out.println("dasdasdas" + bib.getLibros());
        System.out.println("546" + bib.listaClientesPub());
    }

}
