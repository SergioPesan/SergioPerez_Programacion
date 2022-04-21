package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    //atributos
    private String nombre, apellido, password;

    //constructores
    public Usuario() {}

    public Usuario(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }


    //getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
