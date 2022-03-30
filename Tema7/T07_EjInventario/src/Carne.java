public class Carne extends Alimento{

    // atributos
    private int proteinas;

    //constructores
    public Carne(){}

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    //métodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteínas " + proteinas);
    }

    //getter y setter

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
