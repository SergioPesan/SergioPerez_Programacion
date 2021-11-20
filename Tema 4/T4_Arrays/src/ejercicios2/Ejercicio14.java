package ejercicios2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int filas;
        int columnas;
        int aleatorio = (int) (Math.random()*101);

        do {
            System.out.println("Introduce el numero de filas para la array");
            filas = entradaTeclado.nextInt();
            System.out.println("Introduce el numero de columnas para la array");
            columnas = entradaTeclado.nextInt();
        }while(filas < 1 && columnas < 1);

        int[][] array = new int[filas][columnas];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = aleatorio;
                System.out.print(array[i][j]);
            }
            System.out.printf("\t");
        }

        entradaTeclado.close();
    }
}
