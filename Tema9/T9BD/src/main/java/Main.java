import controller.ControllerBD;
import database.SchemeDB;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido,continuar;
        int edad=0;

        ControllerBD controllerBD = new ControllerBD();
        //controllerBD.insertarAlumnoStatement();
        controllerBD.insertarAlumnoPrepare();

        /*do {
            System.out.println("introduce nombre");
            nombre = scanner.next();
            System.out.println("introduce apellido");
            apellido = scanner.next();
            System.out.println("introduce edad");
            edad = scanner.nextInt();

            Alumno alumno = new Alumno();

            System.out.println("Quieres continuar?(s/n)");
            continuar = scanner.next();

        }while (continuar.equalsIgnoreCase("s"));*/


        scanner.close();
    }
}
