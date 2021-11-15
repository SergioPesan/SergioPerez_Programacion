package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numeros = new int[30];
        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            int aleatorio =(int) (Math.random()*11);

            numeros[i] = aleatorio;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d : %d%n", i, numeros[i]);

            suma += numeros[i];
        }

        System.out.printf("Has obtenido %d puntos %n", suma);

        media = (double) suma / (double) numeros.length;

        System.out.printf("La media es: %.3f %n ", media);

    }
}
