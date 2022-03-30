public abstract class Alimento implements Inventariable{

    // atributos
    private String calidad, origen;
    private double precio;

    //constructor

    public Alimento() {}

    public Alimento(String calidad, String origen, double precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    //métodos
    public void mostrarDatos(){
        System.out.println("Calidad " + calidad);
        System.out.println("Origen " + origen);
        System.out.println("Precio " + precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio + (this.precio * IVA_ALIMENTOS));
        System.out.println("El precio con IVA es de: " + precio);
    }

    //getter y setter
    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
