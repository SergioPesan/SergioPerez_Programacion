package ejercicioCajeroBase;

import java.util.ArrayList;

public class Cliente {
    String dni, nombre;
    int telefono;

    ArrayList listaCuentas = new ArrayList();

    public Cliente(String dni, String nombre, int telefono){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void  mostrarDatos(){
        System.out.println(dni);
        System.out.println(nombre);
        System.out.println(telefono);
    }

}
