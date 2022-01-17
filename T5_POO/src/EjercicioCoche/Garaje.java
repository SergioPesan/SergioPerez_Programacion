package EjercicioCoche;

public class Garaje {

    //Variables
    private Coche coche;
    private String averia;
    private int numCoches;

    //Constructor por defecto se da por escrito
    //método aceptar coche

    public void devolverCoche(){
        this.coche = null;
    }

    public boolean aceptarCoche(Coche coche, String averia) {
        if (this.coche != null) {
            return false;
        } else {
            numCoches++;
            this.coche = coche;
            //si la averia del coche es aceite, se incrementa 10 litros
            if (averia.equalsIgnoreCase("aceite")) {
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite() + 10);

            } else {
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite() + (int) (Math.random() * 1000));
            }
            return true;
        }

        //método devolver coche

    }
}
