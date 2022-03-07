public class Nacional extends Llamada{

    private int franja;

    public Nacional(long numOrigen, long numDestino, int duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
        calcularCoste();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja: " + franja);
    }

    @Override
    public void calcularCoste() {
        /*if(franja == 1){
            this.coste = this.duracion * 0.20;
        }else if(franja == 2){
            this.coste = this.duracion * 0.25;
        }else if(franja == 3){
            this.coste = this.duracion * 0.30;
        }*/

        switch (franja){
            case 1:
                this.coste = this.duracion * 0.20;
                break;
            case 2:
                this.coste = this.duracion * 0.25;
                break;
            case 3:
                this.coste = this.duracion * 0.30;
                break;
        }
    }
}
