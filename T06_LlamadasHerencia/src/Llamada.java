import org.w3c.dom.ls.LSOutput;

public abstract class Llamada {
    protected long numOrigen, numDestino;
    protected int duracion;
    protected double coste;

    public Llamada(){}
    public Llamada(long numOrigen, long numDestino, int duracion){
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
        calcularCoste();
    }

    public abstract void calcularCoste();

    public void mostrarDatos(){
        System.out.println("Origen: " + numOrigen);
        System.out.println("Destino: " + numDestino);
        System.out.println("Duración: " + duracion);
        System.out.println("Coste: " + coste);
    }

    public long getNumOrigen() {
        return numOrigen;
    }

    public long getNumDestino() {
        return numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCoste() {
        return coste;
    }
}
