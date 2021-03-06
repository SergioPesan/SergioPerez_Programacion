public abstract class Persona {

    protected String nombre, apellido;
    protected double sueldo;

    public Persona(){}
    public Persona(String nombre, String apellido, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        calcularSueldo();
    }

    public abstract void calcularSueldo();
    public void mostraDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("sueldo: " + sueldo);
    }

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
