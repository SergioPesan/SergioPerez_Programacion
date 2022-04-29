import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        System.out.println("Escoge una opcion");
        opcion = scanner.nextInt();

        JSONController controller = new JSONController();

        switch (opcion){
            case 1:
                controller.pasarStringJson();
                break;
            case 2:
                controller.leerFicheroJson();
                break;
            case 3:
                controller.leerJSONAsignaturas();
                break;
        }

        scanner.close();
    }
}
