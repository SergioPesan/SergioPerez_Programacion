package ejercicioAgenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        Agenda agenda = new Agenda();
        Persona persona = new Persona();
        agenda.agregar(persona);
        agenda.agregar(new Persona());
        agenda.listar();

        agenda.borrar("1234");

        int opcion;

        do {
            System.out.println("1. Agregar persona a la agenda");
            System.out.println("2. Borrar persona");
            System.out.println("3. Editar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Listar agenda");
            opcion = entradaTeclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre");

                    System.out.println("Introduce el teléfono");
                    System.out.println("Introduce el DNI");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(opcion >= 1 && opcion <= 5);


        entradaTeclado.close();
    }
}
