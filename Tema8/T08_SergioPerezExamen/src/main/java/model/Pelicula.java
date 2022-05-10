package model;

public class Pelicula {

    //Atributos

    private String titulo, fechaLanzamiento, descripcion;

    public Pelicula() {
    }

    // constructores

    public Pelicula(String titulo, String fechaLanzamiento, String descripcion) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.descripcion = descripcion;
    }

    // getter & setter


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    //metodo toString()

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
