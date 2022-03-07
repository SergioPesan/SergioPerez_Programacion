public class Directivo implements Comision{

    private double capital, voto = 0.5, beneficio = 0.25;

    public Directivo(){}
    public Directivo(double capital, double voto, double beneficio) {
        this.capital = capital;
        this.voto = voto;
        this.beneficio = beneficio;
    }

    @Override
    public void repartirBeneficios() {

    }

    //Getter & Setter

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
}
