import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion,curso;
        String ciclo;




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
                System.out.println("Que ciclo quieres mirar");
                    ciclo = scanner.next();
                System.out.println("Que curso quieres mirar");
                curso = scanner.nextInt();
                controller.leerJSONAsignaturas(curso,ciclo);
                break;
            case 4:
                System.out.println("Cuantos usuarios quieres?");
                int numero = scanner.nextInt();
                controller.lecturaJSONAPI(numero);
                break;
        }

        scanner.close();
    }
}
