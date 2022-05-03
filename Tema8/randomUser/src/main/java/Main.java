import controller.JSONController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroUsuarios;
        String genero;
        JSONController controller = new JSONController();
        System.out.println("Cuantos usuarios?");
        numeroUsuarios = scanner.nextInt();
        System.out.println("Que genero(male/female/ambos)");
        genero = scanner.next();



        scanner.close();
    }
}
