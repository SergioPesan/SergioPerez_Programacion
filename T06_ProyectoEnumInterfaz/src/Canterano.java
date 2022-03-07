public class Canterano extends Persona{
    private int posibilidades;


    public Canterano(String nombre, String apellido, int sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }

    @Override
    public void mostraDatos() {
        super.mostraDatos();
        System.out.println("Posibilidades: " + posibilidades);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 100;
    }
}
