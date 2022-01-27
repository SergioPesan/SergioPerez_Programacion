package ejercicioAgenda;

public class Persona {
    //atributos
    private String nombre, dni;
    private int telefono;

    //constructores
    public Persona(){}

    public Persona(String nombre, String dni, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //método
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(telefono);
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
