package ejerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16Garaje {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        ArrayList<Object[]> listaCoches = new ArrayList<>();
        String marca, modelo, matricula;
        int coste;

        int opcion;

        System.out.println("0. Terminar programa");
        System.out.println("1. Añadir coche");
        System.out.println("2. Listar de coches");
        System.out.println("3. Buscar coche");
        System.out.println("4. Mostrar costes");
        System.out.println("5. Eliminar coche");
        System.out.println("6. Vaciar garage");

        do {
            System.out.println("Escocge una opción");
            opcion = entradaTeclado.nextInt();

            switch (opcion){
                //Añadir coche
                case 1:
                    System.out.println("Introduce la marca");
                    marca = entradaTeclado.next();
                    System.out.println("Introduce el modelo");
                    modelo = entradaTeclado.next();
                    System.out.println("Introcude el coste");
                    coste = entradaTeclado.nextInt();
                    System.out.println("Introduce la matricula");
                    matricula = entradaTeclado.next();
                    listaCoches.add(new Object[]{marca, modelo, coste, matricula});
                    break;
                    //listar covhes
                case 2:
                    for (Object[] coche: listaCoches) {
                        for (Object item: coche) {
                            System.out.print("\t" + item);
                        }
                        System.out.println();
                    }
                    break;
                    //buscar coches por su matrícula
                case 3:
                    System.out.println("Introduce la matricula que quieres buscar");
                    matricula = entradaTeclado.next();

                    for (Object[] coche: listaCoches) {
                        if (coche[3].equals(matricula)) {
                            for (Object item : coche) {
                                System.out.print("\t" + item);
                            }
                        }else{
                            System.out.println("Esa matrícula no esta registrada");
                        }
                        System.out.println();
                    }
                    break;
                    //mostrar coste acumulado de todos los coches
                case 4:
                    int suma = 0;


                    for (int i = 0; i < listaCoches.size(); i++) {
                        suma += (Integer) listaCoches.get(i)[2];
                    }

                    System.out.println("El coste acumulado es: " + suma);

                    break;
                    //eliminar un coche pidiendo su matricula
                case 5:
                    System.out.println("Introduce la matricula del coche que quieres eliminar");
                    matricula = entradaTeclado.next();

                    for (int i = 0; i < listaCoches.size(); i++) {
                        if (matricula == listaCoches.get(i)[2]){
                            listaCoches.remove(i);
                        }else{
                            System.out.println("No se ha encontrado esa matricula");
                        }

                    }

                    break;
                    //vaciar garaje
                case 6:
                    listaCoches.clear();
                    break;
            }

        }while(opcion != 0);

        entradaTeclado.close();
    }
}
