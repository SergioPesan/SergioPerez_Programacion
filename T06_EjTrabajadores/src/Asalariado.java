public class Asalariado extends Trabajador{
    private int pagas;


    public Asalariado(String nombre, String apellido, String dni, double sueldo, String departamento, int pagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.pagas = pagas;
    }

    //Getter & Setter

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }
}
