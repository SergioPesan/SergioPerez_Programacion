public class Autonomos extends Trabajadores {
    private double sueldo;
    private boolean contratado;

    public Autonomos(String nombre, String apellido, String dni, double sueldo, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

}
