package ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int longitud;

        System.out.println("Introduce la longitud de la array");
        longitud = entradaTeclado.nextInt();

        int[] numeros = new int[longitud];
        int ultimo = numeros[numeros.length-1];

        for (int i = numeros.length - 1; i > 0; i--) {
            System.out.println("Introduce un número");
            numeros[i] = entradaTeclado.nextInt();

            numeros[i] = numeros[i-1];
        }
        numeros[0] = ultimo;

        for (int item: numeros) {
            System.out.print(item + "");
        }


        entradaTeclado.close();
    }
}
