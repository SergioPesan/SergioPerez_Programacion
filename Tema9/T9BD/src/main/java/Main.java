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

        System.out.println("Introdice nombre modificar: ");
        nombre = scanner.next();
        System.out.println("Introduce la nueva edad: ");
        edad = scanner.nextInt();

        controllerBD.actualizarEdadAlumno(nombre,edad);

        System.out.println("Introduce una edad \f" +
                "todas los alumnos con la edad inferior a la seleccionada seran eliminados");
        edad = scanner.nextInt();
        controllerBD.eliminarAlumno(edad);

        scanner.close();
    }
}
