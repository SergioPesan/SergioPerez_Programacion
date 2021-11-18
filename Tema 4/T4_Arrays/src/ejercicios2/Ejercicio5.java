package ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int longitud;

        System.out.println("Introduce la longitud de las arrays");
        longitud = entradaTeclado.nextInt();

        int[] numeros1 = new int[longitud];
        int[] numeros2 = new int[longitud];
        int[] numeros3 = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un numero para la primera array");
            numeros1[i] = entradaTeclado.nextInt();
        }
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un numero para la segunda array");
            numeros2[i] = entradaTeclado.nextInt();
        }
        for (int i = 0; i < longitud; i++) {
            numeros3[i]= numeros1[i] + numeros2[i];

            System.out.println("Los numeros del tercer array son: " + numeros3[i]);
        }

        entradaTeclado.close();
    }
}
