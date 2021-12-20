package BaseHashTable;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio16Hash {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        String marca, modelo, matricula;
        int coste;

        Hashtable<String,Object[]> listaCoches = new Hashtable<>();



        int opcion;

        System.out.println("0. Terminar programa");
        System.out.println("1. Añadir coche");
        System.out.println("2. Listar de coches");
        System.out.println("3. Buscar coche");
        System.out.println("4. Mostrar costes");
        System.out.println("5. Eliminar coche");
        System.out.println("6. Vaciar garage");

        do {
            System.out.println("Escoge una opción");
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

                    Object[] coche = new Object[]{marca,modelo,coste,matricula};

                    listaCoches.put(coche[3].toString(), coche);
                    if (listaCoches.size() < 5){
                        System.out.println("Coche recepcionado");
                    }else{
                        System.out.println("El garaje ya está lleno");
                    }
                    break;
                    //listar coches
                case 2:
                    Enumeration<Object[]> listaCochesEnum = listaCoches.elements();

                    while (listaCochesEnum.hasMoreElements()){
                        Object[] cocheActual = listaCochesEnum.nextElement();
                        for (Object item: cocheActual) {
                            System.out.print("\t" + item);
                        }
                        System.out.println();
                    }
                    break;
                    //buscar coches por su matricula
                case 3:
                    System.out.println("Introduce la matricula del coche que deseas buscar");
                    matricula = entradaTeclado.next();

                    boolean encontrado;

                    listaCochesEnum = listaCoches.elements();

                    while (listaCochesEnum.hasMoreElements()){
                        if (Object coche[3].equals(matricula)) {
                            encontrado = true;
                            Object[] cocheActual = listaCochesEnum.nextElement();
                            for (Object item : cocheActual) {
                                System.out.print("\t" + item);
                            }
                        }
                        System.out.println();
                    }

                    if (!encontrado){
                        System.out.println("No se ha encontrado esa matricula");
                    }

                    break;
                    //mostrar coste acumulado de todos los coches
                case 4:
                    break;
                    //eliminar un coche pidiendo su matricula
                case 5:
                    break;
                    //vaciar garaje
                case 6:
                    break;
            }

        }while(opcion != 0);




        entradaTeclado.close();
    }
}
