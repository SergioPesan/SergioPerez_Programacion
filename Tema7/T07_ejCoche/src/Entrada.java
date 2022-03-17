public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche(20000,"Ford","Focus", 150);

        Coche.Motor motor = coche.new Motor(200,2500);
        Coche.Motor motor1 = coche.new Motor(400,4000);

        motor1.revalorizarCoche();
        coche.mostrarDatos();

    }
}
