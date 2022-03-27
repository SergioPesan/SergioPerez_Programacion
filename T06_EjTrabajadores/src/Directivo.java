public class Directivo extends Persona implements Comision{

    private int capital;

    public Directivo(){}
    public Directivo(int capital, double voto, double beneficio) {
        this.capital = capital;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: " + capital);
    }


    //Getter & Setter

    public double getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }


    @Override
    public double votar() {
        return 0;
    }

    @Override
    public void obtenerBeneficios() {

    }
}
