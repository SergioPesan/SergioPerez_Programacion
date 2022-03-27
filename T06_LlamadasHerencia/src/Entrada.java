import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //Provincial llamadaProvincial = new Provincial(123,123,40);
        //llamadaProvincial.mostrarDatos();

        Centralita centralita = new Centralita();
        Nacional llamadaNacional = new Nacional(123123,123123,10,1);
        Provincial llamadaProvincial = new Provincial(123,123,40);
        Provincial llamadaLocal = new Provincial(123,123,30);

        centralita.registrarLlamada(llamadaLocal);
        System.out.println(" ");
        centralita.registrarLlamada(llamadaNacional);
        System.out.println(" ");
        centralita.registrarLlamada(llamadaProvincial);

        System.out.println(" ");
        centralita.mostrarLlamada("nacionales");
        System.out.println(" ");
        centralita.mostrarLlamada("locales");
        System.out.println(" ");
        centralita.mostrarLlamada("provinciales");
    }
}
