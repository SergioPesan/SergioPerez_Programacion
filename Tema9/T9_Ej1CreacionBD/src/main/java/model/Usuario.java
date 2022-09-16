package model;

public class Usuario {
    //atributos

    private String nombre, apellido, pais;
    private int id, telefono, sueldo, id_perfil;

    // constructores

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String pais,int telefono, int sueldo, int id_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.id_perfil = id_perfil;
    }

    // Getter & Setter

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }


    // Método toString()


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", id=" + id +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                ", id_perfil=" + id_perfil +
                '}';
    }
}
