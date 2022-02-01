package ejercicioAgenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        /*Agenda agenda = new Agenda();
        Persona persona = new Persona("Sergio","1234A", 654654);
        agenda.agregar(persona);
        agenda.agregar(new Persona("Jimmy","4567B",123123));
        agenda.listar();

        agenda.borrar("1234");*/

        int opcion, telefono = 0;
        String dni = "", nombre = "";

        Agenda agenda = new Agenda();
        Persona persona = new Persona(nombre,dni,telefono);

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
                    nombre = entradaTeclado.next();
                    System.out.println("Introduce el teléfono");
                    telefono = entradaTeclado.nextInt();
                    System.out.println("Introduce el DNI");
                    dni = entradaTeclado.next();

                    agenda.agregar(persona);

                    System.out.println(nombre + "ha sido añadido/a a la agenda");
                    break;
                case 2:
                    System.out.println("Introduce el dni de la persona que quieres eliminar");
                    dni = entradaTeclado.next();

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
