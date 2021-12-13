package ejerciciosArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 { //Ejercicio 6, 7 y 8
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        Object[] coche1 = new Object[] {"Mercedes", "c228", 250};
        Object[] coche2 = new Object[] {"Audi", "A5", 350};
        Object[] coche3 = new Object[] {"BMW", "Arteon", 180};

        ArrayList<Object[]> listaCoches = new ArrayList<>();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        listaCoches.add(new Object[]{"Ford", "Focus", 150});
        listaCoches.add(new Object[]{"Ford", "Mondeo", 423});
        listaCoches.add(new Object[]{"Ford", "Fiesta", 123});
        listaCoches.add(new Object[]{"Mercedes", "c180", 150});
        listaCoches.add(new Object[]{"Mercedes", "ClaseA", 412});
        listaCoches.add(new Object[]{"Mercedes", "Benz", 159});
        listaCoches.add(new Object[]{"Audi", "r8", 450});
        listaCoches.add(new Object[]{"Audi", "A3" , 360});


        String marca = "";
        System.out.println("Introduce una marca");
        marca = entradaTeclado.next();



        //obtener los coches

        /*Object[] cocheSeleccionado = listaCoches.get(0);
        System.out.println(cocheSeleccionado[1]);

        System.out.println(listaCoches.get(2)[0]);*/

        for (Object[] coche : listaCoches) {
            //System.out.println("Modelo: " + coche[0] + "     Marca: " + coche[1] + "      CV: " + coche[2]);
            if (coche[0].toString().equalsIgnoreCase(marca)) {
                for (Object item : coche) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }
        }

        /*for (int i = 0; i < listaCoches.size(); i++) {
            Object[] cocheActual = listaCoches.get(i);
            //System.out.println("Modelo: " + cocheActual[0] + "     Marca: " + cocheActual[1] + "      CV: " + cocheActual[2]);

            for (int j = 0; j < cocheActual.length; j++) {
                System.out.print("\t " + cocheActual[j]);
            }
            System.out.println("");
        }*/

        entradaTeclado.close();
    }
}
