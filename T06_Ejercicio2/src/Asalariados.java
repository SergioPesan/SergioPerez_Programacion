public class Asalariados extends Trabajador{
    private int sueldo, numPagas;
    private boolean contratado;

    //constructor
    public Asalariados(){}
    public Asalariados(String nombre, String apellido, String dni, int sueldo, int numPagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contratado = contratado;
    }

    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Número de pagas: " + numPagas);
        System.out.println("Contratado: " + contratado);
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getNumPagas() {
        return numPagas;
    }

    public boolean isContratado() {
        return contratado;
    }
}
