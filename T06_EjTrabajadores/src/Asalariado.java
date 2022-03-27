public final class Asalariado extends Trabajador{
    private int numeroPagas;


    public Asalariado(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numeroPagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numeroPagas = numeroPagas;
    }

    //Getter & Setter

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pagas: " + numeroPagas);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Administracion.IRPF);
    }
}
