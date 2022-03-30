public abstract class Mueble implements Inventariable{

    // atributos
    protected String material;
    protected int peso;
    protected double precio;

    //constructores

    public Mueble() {}

    public Mueble(String material, int peso, double precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    // métodos
    public void mostrarDatos(){
        System.out.println("Material " + material);
        System.out.println("Peso " + peso);
        System.out.println("Precio " + precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio + (this.precio * IVA_MUEBLES));
        System.out.println("El precio con IVA es de: " + precio);
    }

    //getter y setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
