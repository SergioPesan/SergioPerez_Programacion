package ejerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList();

        int suma = 0, max = -99999, min = 99999, numeroAleatorios = 0;
        double media;

        System.out.println("Introduce el número de valores aleatorios que quieres");
        numeroAleatorios = entradaTeclado.nextInt();

        for (int i = 0; i < numeroAleatorios; i++) {
            numeros.add((int) (Math.random()*101));
        }
        System.out.println(numeros);

        for (Integer item: numeros) {
            suma += item;

            if (item > max){
                max = item;
            }
            if (item <min){
                min = item;
            }
        }

        media = (double) suma / (double) numeros.size();
        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("La media de todos los números es: " + media);
        System.out.println("El número más pequeño es: " + min);
        System.out.println("El número más grande es: " + max);

        entradaTeclado.close();
    }
}
