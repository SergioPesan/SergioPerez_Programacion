import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Idioma castellano = new Idioma("Castellano", 50000) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es: Hola");
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: Adiós");
            }
        };

        Idioma ingles = new Idioma("Inglés", 100000) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es: Hello");
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: Bye");
            }
        };

        Idioma aleman = new Idioma("Alemán", 25000) {
            @Override
            public void saludar() {
                System.out.println("El  saludo en " + getNombre() + " es: Hallo");
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es: Tschüss");
            }
        };

        castellano.ingresarPalabra("Esto");
        castellano.ingresarPalabra("es");
        castellano.ingresarPalabra("programación");

        ingles.ingresarPalabra("This");
        ingles.ingresarPalabra("is");
        ingles.ingresarPalabra("programming");

        aleman.ingresarPalabra("Das");
        aleman.ingresarPalabra("ist");
        aleman.ingresarPalabra("programmierung");

        castellano.saludar();
        castellano.despedir();

        System.out.println("");

        ingles.saludar();
        ingles.despedir();

        System.out.println("");

        aleman.saludar();
        aleman.despedir();

        System.out.println("");

        castellano.listarPalabras();
        ingles.listarPalabras();
        aleman.listarPalabras();

    }
}
