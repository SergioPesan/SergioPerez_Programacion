public class Autonomo extends Trabajador{
    private int sueldo;
    private boolean contratado;
public  Autonomo(){}
    public Autonomo(String nombre, String apellido, String dni, int sueldo, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo " + sueldo);
        System.out.println("Contratado " + contratado);
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isContratado() {
        return contratado;
    }
}
