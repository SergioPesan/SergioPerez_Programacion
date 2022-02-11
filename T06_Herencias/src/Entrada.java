public class Entrada {
    public static void main(String[] args) {
        /*Coche coche = new Coche("123A", "123", 100,2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());*/

       /* Deportivo deportivo = new Deportivo("234B","234",200,2500,600);
        Electrico electrico = new Electrico("456G", "456", 150, 2000, 5000);
        SUV suv = new SUV("789C","789", 100, 1500, "trasera");
        Utilitario utilitario = new Utilitario("159B","159", 150, 1750, 5);

        System.out.println(deportivo.getMatricula());
        deportivo.calcularVelocidad(120);
        electrico.calcularVelocidad(120);
        suv.calcularVelocidad(120);
        utilitario.calcularVelocidad(120);
        System.out.println("Velociad calculada del deportivo: " + deportivo.getVelocidad() + " Km/h");
        System.out.println("Velociad calculada del eléctrico: " + electrico.getVelocidad() + " Km/h");
        System.out.println("Velociad calculada del SUV: " + suv.getVelocidad() + " Km/h");
        System.out.println("Velociddad del utilitario: " + utilitario.getVelocidad() + " Km/h");*/


        Concesionario concesionario = new Concesionario();
        Utilitario utilitario = new Utilitario("159B","159", 150, 1750, 5);
        SUV suv = new SUV("789C","789", 100, 1500, "trasera");
        Electrico electrico = new Electrico("456G", "456", 150, 2000, 5000);
        Deportivo deportivo = new Deportivo("234B","234",200,2500,600);


        concesionario.agregarCoche(utilitario);
        concesionario.agregarCoche(suv);
        concesionario.agregarCoche(electrico);
        concesionario.agregarCoche(deportivo);



    }
}
