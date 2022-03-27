public class Canterano extends Persona implements  Seleccionable{
    private int posibilidades;
    private int ataque;


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

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }

    @Override
    public void repartirPrima() {

    }
}
