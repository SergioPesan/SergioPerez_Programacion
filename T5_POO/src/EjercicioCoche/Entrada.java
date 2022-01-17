package EjercicioCoche;

public class Entrada {
    public static void main(String[] args) {
        Motor motorGasoil = new Motor(1000,150);
        Motor motorGasolina = new Motor(120,500);

        Coche cocheGasolina = new Coche("Ford","Fiesta", new Motor(500,120));
        Coche cocheGasoil = new Coche("Opel","Corsa", new Motor(1000,150));

        //cocheGasoil.getMotor().getCv();

        /*System.out.println();
        cocheGasoil.acumularAveria(900);
        cocheGasoil.acumularAveria(300);
        System.out.println(cocheGasoil.getCosteAveria());*/

        Garaje garaje = new Garaje();
        //coche = null // numCoches = 0 // averia = null

        garaje.devolverCoche();

        if (garaje.aceptarCoche(cocheGasoil,"aceite") == true){ //==true es redundante
            System.out.println("Coche aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosAceite());
        }else {
            System.out.println("Garaje ocupado");
        }

        if (garaje.aceptarCoche(cocheGasolina,"aceite") == true){ //==true es redundante
            System.out.println("Coche aceptado");
            System.out.println(cocheGasolina.getMotor().getLitrosAceite());
        }else {
            System.out.println("Garaje ocupado");
        }

    }
}
