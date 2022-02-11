public class SUV extends Coche{

    private String traccion;

    public SUV(String matricula, String bastidor, int cv, int cc, String traccion){
        super(matricula,bastidor,cv,cc);
        this.traccion = traccion;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad + (int)(Math.random()*7)+10);
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

}
