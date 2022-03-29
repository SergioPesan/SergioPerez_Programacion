public final class Mesa extends Mueble{

    //atributos
    private int capacidad;

    //constructores

    public Mesa() {
    }

    public Mesa(String material, int peso, double precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidad);
    }

    //getter y setter

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
