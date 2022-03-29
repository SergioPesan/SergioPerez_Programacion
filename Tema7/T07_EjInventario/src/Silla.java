public final class Silla extends Mueble{

    //atributos
    private int patas;

    //constructores
    public Silla() {
    }

    public Silla(String material, int peso, double precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Patas: " + patas);
    }


    //getter y setter

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
