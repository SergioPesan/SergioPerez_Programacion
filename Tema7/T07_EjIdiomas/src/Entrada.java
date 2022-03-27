import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Idioma castellano = new Idioma("Castellano",20000000) {
            @Override
            public void saludar() {
                System.out.println("Estoy saludando en español");
                System.out.println("Saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("Me estoy despidiendo en español");
                System.out.println("Despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idioma ingles = new Idioma("Inglés", 50000000) {
            @Override
            public void saludar() {
                System.out.println("Estoy saludando en inglés");
                System.out.println("Saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("Estoy despidiendo en aleman");
                System.out.println("Despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idioma aleman = new Idioma("Alemán",10000000) {
            @Override
            public void saludar() {
                System.out.println(" ");
                System.out.println("Saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println(" ");
                System.out.println("Saludo en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        castellano.ingresarPalabra("Hola");
        castellano.ingresarPalabra("Adios");
        castellano.ingresarPalabra("Esto");
        castellano.ingresarPalabra("es");
        castellano.ingresarPalabra("programación");

        ingles.ingresarPalabra("Hello");
        ingles.ingresarPalabra("Bye");
        ingles.ingresarPalabra("This");
        ingles.ingresarPalabra("is");
        ingles.ingresarPalabra("programming");


        aleman.ingresarPalabra("Hallo");
        aleman.ingresarPalabra("Tschüss");
        aleman.ingresarPalabra("Das");
        aleman.ingresarPalabra("ist");
        aleman.ingresarPalabra("programmierung");

        ArrayList<Idioma> listaIdiomas = new ArrayList();
        listaIdiomas.add(castellano);
        listaIdiomas.add(ingles);
        listaIdiomas.add(aleman);

        for ( Idioma idioma : listaIdiomas ) {
            idioma.saludar();
            idioma.despedir();
        }


        castellano.listarPalabras();
        ingles.listarPalabras();
        aleman.listarPalabras();


    }
}
