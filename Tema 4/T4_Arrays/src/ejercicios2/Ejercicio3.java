package ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int numeroIntro = 0;
        double media, suma = 0;
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor, introduce un número");
            numeroIntro = entradaTeclado.nextInt();

            numeros[i] = numeroIntro;
        }

        for (int multiplicar:numeros) {
            System.out.println(multiplicar * 2);
        }

        for (int item: numeros) {
            suma += item;
        }

        media = (double) suma / (double) numeros.length;

        System.out.println("La suma de los números es:" + suma);
        System.out.println("La media de los números es:" + media);

        entradaTeclado.close();
    }
}
