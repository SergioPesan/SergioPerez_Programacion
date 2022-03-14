public class Accionista extends Persona implements Comision{
    private double acciones ;

    public Accionista(double acciones, double voto, double beneficios) {
        this.acciones = acciones;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje de acciones: " + acciones);
    }
    //Getter & Setter

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }

    @Override
    public double votar(int voto) {
        return 0;
    }

    @Override
    public void obtenerBeneficios() {

    }
}
