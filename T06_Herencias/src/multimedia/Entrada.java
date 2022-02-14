package multimedia;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
       // Elemento elemento = new Elemento("1","egy5", "reiugq", "145", "ejrg");
       // Libro libro = new Libro();

        ArrayList<Elemento> listaElementos = new ArrayList<>();

        // Acceso a cualquier cosa
        Libro libro = new Libro("1", "Libro titulo", "Autor libro",
                "100", "Digital", 123,100);

        Video video = new Video("2", "Video titulo", "Autor video",
                "100", "Digital", "123","100");

        Audio audio = new Audio("3", "Audio titulo", "Autor audio",
                "100", "Digital", 123,"100");

        Elemento libroElemento = new Libro("1", "Libro titulo", "Autor libro",
                "100", "Digital", 123,100);

        // libroElemento.mostrarDatos();

        // clase a la que pertenece Libro.class
        System.out.println(libro.getClass());
        System.out.println(libro.getClass().getName());
        System.out.println(libro.getClass().getCanonicalName());

        System.out.println(libro instanceof Libro);
        System.out.println(libro instanceof Elemento);
        System.out.println(libroElemento instanceof Libro);

        System.out.println(" ");

        listaElementos.add(libro);
        listaElementos.add(audio);
        listaElementos.add(video);
        listaElementos.add(libroElemento);

        //LIBRO --> metodoLibro
        //AUDIO --> metodoAudio
        //VIDEO --> metodoVideo
        // dependiendo del objeto que sea, quiero ejecutar su método específico

        for (Elemento elemento: listaElementos) {

            if (elemento instanceof Libro) {
                //elemento.mostrarDatos();
                ((Libro) elemento).metodoLibro();
                System.out.println(" ");
            }else if (elemento instanceof  Audio){
                //elemento.mostrarDatos();
                ((Audio) elemento).metodoAudio();
                System.out.println(" ");
            }else if (elemento instanceof  Video){
                //elemento.mostrarDatos();
                ((Video) elemento).metodoVideo();
                System.out.println(" ");
            }

        }
    }
}
