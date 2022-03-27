import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        ArrayList<Trabajador> listaTrabajadores;
        int opcion;

        System.out.println("Escoge una opción: ");
        System.out.println("1.  Registrar trabajador");
        System.out.println("2. Listar trabajadores");
        System.out.println("3. Mostrar datos de trabajador");
        opcion = entradaTeclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Selecciona una opción");
                System.out.println("1. Asalariado");
                System.out.println("2. autonomo");
                System.out.println("3. jefe");
                opcion = entradaTeclado.nextInt();

                switch(opcion){
                    case 1:


                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                }
                break;
            case 2:
                System.out.println("Vas a listar:");
                System.out.println("1. Asalariado");
                System.out.println("2. Autonomo");
                System.out.println("3. Todos");
                opcion = entradaTeclado.nextInt();

                switch (opcion){
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
        }


        entradaTeclado.close();
    }
}
