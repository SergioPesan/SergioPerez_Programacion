public class Utilitario extends Coche{
    int plazas;

    public Utilitario(String matricula, String bastidor, int cv, int cc, int plazas){
        super(matricula,bastidor,cv,cc);
        this.plazas = plazas;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
