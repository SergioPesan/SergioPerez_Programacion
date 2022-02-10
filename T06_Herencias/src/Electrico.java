public class Electrico extends Coche{

    int bateria;

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria){
        super(matricula,bastidor,cv,cc);
        this.bateria = bateria;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad + (int)(Math.random()*11)+20);
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
