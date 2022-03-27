import java.util.ArrayList;

public class Socio extends Trabajador{
    protected int numSocio;
    protected ArrayList prestamos;

    public Socio() {
        prestamos = new ArrayList();
    }

    public Socio(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de Socio: " + numSocio);
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
}
