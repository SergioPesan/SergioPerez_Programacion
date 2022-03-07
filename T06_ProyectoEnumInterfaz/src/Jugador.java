public final class Jugador extends Persona implements  Seleccionable{
    private String posicion;

    public Jugador(String nombre, String apellido, int sueldo, String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void calcularSueldo() {
        //sueldo neto = sueldo bruto - retenciones(irpf e iva)

        this.sueldo = this.sueldo - (this.sueldo * Constantes.irpf);
    }

    @Override
    public void mostraDatos() {
        super.mostraDatos();
        System.out.println("posicion" + posicion);
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
