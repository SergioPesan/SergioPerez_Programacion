public final class Entrenador extends Persona{
    private String vocacion;

    public Entrenador(String nombre, String apellido, int sueldo, String vocacion) {
        super(nombre, apellido, sueldo);
        this.vocacion = vocacion;
    }

    @Override
    public void calcularSueldo() {

    }
}
