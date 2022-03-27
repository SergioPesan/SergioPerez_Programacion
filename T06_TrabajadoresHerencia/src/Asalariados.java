public class Asalariados extends Trabajadores{
    private double sueldo;
    private int numPagas;
    private boolean contratado;

    public Asalariados(String nombre, String apellido, String dni, double sueldo, int numPagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contratado = contratado;
    }

}
