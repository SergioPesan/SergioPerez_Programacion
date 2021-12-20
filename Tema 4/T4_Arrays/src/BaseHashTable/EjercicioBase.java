package BaseHashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioBase {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        Hashtable<String,Object[]> listaCoches = new Hashtable();

        Object[] coche = new Object[]{"Ford", "Focus","5678C"};

        listaCoches.put(coche[2].toString(),coche);
        listaCoches.put("1574A",new Object[]{"1574A","Toyota","Supra"});
        listaCoches.put("1234B",new Object[]{"1234B","Audi","R8"});

        /*System.out.println("Introduce la matricula que quieres encontrar");
        String matricula = entradaTeclado.next();

        if (listaCoches.get(matricula) != null){*/
            /*Object[] cocheEncontrado = listaCoches.get(matricula);
            for (Object item : cocheEncontrado) {
                System.out.print("\t" + item);
            }*/
           /* for (Object item: listaCoches.get(matricula)) {
                System.out.print("\t" + item);
            }

        }else {
            System.out.println("No está en la lista");
        }*/

        /*for (Object item: listaCoches.get(matricula)) {
            System.out.print("\t" + item);
        }*/

        System.out.println("Listado completo");

        /*Enumeration<String> listaVehiculos = listaCoches.keys();
        while (listaVehiculos.hasMoreElements()){
            Object vehiculo = listaVehiculos.nextElement();
            Object[] cocheActual = listaCoches.get(vehiculo);

            for (Object item: cocheActual) {
                System.out.print("\t" + item);
            }
            System.out.println();
        }*/

        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();

        while (listaCochesEnum.hasMoreElements()){
            Object[] cocheActual = listaCochesEnum.nextElement();
            for (Object item: cocheActual) {
                System.out.print("\t" + item);
            }
            System.out.println();
        }


        entradaTeclado.close();
    }
}
