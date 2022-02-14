package multimedia;

public final class Libro extends  Elemento{
    // id, titulo, autor, tamaño, formato

    private int ISBN, numeroPaginas;

    public Libro(String id, String titulo, String autor, String tamanio, String formato, int ISBN, int numeroPaginas) {
        super(id, titulo, autor, tamanio, formato);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        // haz lo que diga el método de la superclase
        super.mostrarDatos();
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("ISBN: " + ISBN);
    }

    public void metodoLibro(){

    }
}
