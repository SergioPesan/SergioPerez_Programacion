import java.sql.SQLOutput;
import java.util.ArrayList;

public class Trabajador {
    //atributos
    protected String nombre, apellido, dni;
    //constructores
    public Trabajador(){}
    public Trabajador(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }


}
