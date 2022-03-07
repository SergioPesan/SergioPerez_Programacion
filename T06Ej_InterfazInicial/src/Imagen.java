public final class Imagen extends Elemento implements Ejecutable{

    private String isbn;

    public Imagen(){}
    public Imagen(String id, int tamaño, String titulo, String autor, String formato, String isbn) {
        super(id, titulo, autor, formato, tamaño);
        this.isbn = isbn;
    }

    //Getter y Setter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Métodos implementados de la interfaz
    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
