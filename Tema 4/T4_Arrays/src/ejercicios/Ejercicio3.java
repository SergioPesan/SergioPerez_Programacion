package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int numero = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce un numero a guardar");
                numero = entradaTeclado.nextInt();

                numeros[i] = numero;
        }
        System.out.println("Orden normal");
        for (int i = 0; i < numeros.length; i++) {
            if (i < 9){
                System.out.print(numeros[i] +" , ");
            }else{
                System.out.print(numeros[i]);
            }
        }
        System.out.printf("%n");
        System.out.println("Orden inverso");
        for (int i = 9; i > -1; i--) {
            if (i > 0){
                System.out.print(numeros[i] +" , ");
            }else{
                System.out.print(numeros[i]);
            }
        }


        entradaTeclado.close();
    }
}

/*Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:

    en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/