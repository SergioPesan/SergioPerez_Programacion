public class Jefes extends Trabajadores{
    private int acciones;
    private boolean beneficio;

    public Jefes(String nombre, String apellido, String dni, int acciones, boolean beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }
}
