import java.time.Period;

public class Jefe extends Trabajador{
    private int acciones, beneficio;

    //constructor
public Jefe(){}
    public Jefe(String nombre, String apellido, String dni, int acciones, int beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: " + acciones);
        System.out.println("Beneficio: " + beneficio);
    }

    public int getAcciones() {
        return acciones;
    }

    public int getBeneficio() {
        return beneficio;
    }
}
