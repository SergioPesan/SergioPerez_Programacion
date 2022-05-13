package model;

public class Profesor {

    //ATRIBUTOS
    private String nombre, Apellido;

    //CONSTRUCTORES
    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        Apellido = apellido;
    }



    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
