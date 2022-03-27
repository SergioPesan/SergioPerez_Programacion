public class Provincial extends Llamada{


    public Provincial(){}
    public Provincial(long numOrigen, long numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        this.coste = this.duracion * 0.15;
    }
}
