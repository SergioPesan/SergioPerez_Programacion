package model;

public class Perfil {
    // Atributos
    private int id;
    private String nombre;

    // Constructores

    public Perfil() {
    }

    public Perfil(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString()

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
