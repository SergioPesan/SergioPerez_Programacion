import controller.Ejercicio1Controller;
import controller.Ejercicio2Controller;
import controller.Ejercicio3Controller;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ejercicio 1

        Ejercicio1Controller ejercicio1Controller = new Ejercicio1Controller();
        ejercicio1Controller.leerArchivo();

        //Ejercicio 2

        Ejercicio2Controller ejercicio2Controller = new Ejercicio2Controller();
        ejercicio2Controller.leerBin();

        //Ejercicio 3

       Ejercicio3Controller ejercicio3Controller = new Ejercicio3Controller();

        int opcion;

        System.out.println("Seleccione una opción: ");
        System.out.println("1. Ver películas en cartelera");
        System.out.println("2. Ver películas próximamente");
        opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                ejercicio3Controller.carteleraActual();
                break;
            case 2:
                ejercicio3Controller.proximaCartelera();
                break;
        }

        scanner.close();
    }
}
