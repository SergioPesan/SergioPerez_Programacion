package multimedia;

public final class Video extends Elemento {

    private String actores, director;

    public Video(String id, String titulo, String autor, String tamanio, String formato, String actores, String director) {
        super(id, titulo, autor, tamanio, formato);
        this.actores = actores;
        this.director = director;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Actores: " + actores);
        System.out.println("Director: " + director);
    }

    public void metodoVideo(){

    }
}
