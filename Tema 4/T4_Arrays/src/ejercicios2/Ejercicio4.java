package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int longitud;
        int max =-99999, min = 99999;

        System.out.println("¿De que longitud quieres crear el array?");
        longitud = entradaTeclado.nextInt();

        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            int numeroIntro = entradaTeclado.nextInt();

            numeros[i] = numeroIntro;
        }

        /*for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < min){
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        for (int item : numeros) {
            if(item < min){
                min = item;
            }
            if (item > max) {
                max = item;
            }
        }*/

        for (int item:numeros) {
            System.out.println(item);
        }

        System.out.println("Ordenados");

        Arrays.sort(numeros);

        for (int item:numeros) {
            System.out.println(item);
        }

        System.out.println("El mayor es:" + numeros[numeros.length-1]);
        System.out.println("El menor es:" + numeros[0]);




        entradaTeclado.close();
    }
}
