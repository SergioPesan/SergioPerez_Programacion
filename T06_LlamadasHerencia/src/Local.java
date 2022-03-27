public class Local extends Llamada{

    public Local(){}
    public Local(long numOrigen, long numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        this.coste = 0;
    }
}
