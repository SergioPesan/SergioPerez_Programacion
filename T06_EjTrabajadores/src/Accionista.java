public class Accionista implements Comision{
    private double acciones, voto = 1, beneficios = 0.6;

    public Accionista(double acciones, double voto, double beneficios) {
        this.acciones = acciones;
        this.voto = voto;
        this.beneficios = beneficios;
    }

    @Override
    public void repartirBeneficios() {

    }

    //Getter & Setter

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
}
