package ejercicios2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        char[] abecedario =new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        int longitud = 0;

        System.out.println("Introduce la longitud del array");
        longitud = entradaTeclado.nextInt();


        for (int i = 0; i < longitud; i++) {
            System.out.println("palabra" + i);
            System.out.println("¿Cuantas letras tiene la palabra?");
            int letras = entradaTeclado.nextInt();

            String palabra = "";

            for (int j = 0; j < letras; j++) {
                char letraAleatoria = abecedario[(int) (Math.random()* abecedario.length)];
                palabra += letraAleatoria;
            }
            System.out.println(palabra);
        }


        entradaTeclado.close();
    }
}

/*Crear un de chars con todas las letras del abecedario.

Crear un array de String con una longitud pedida por teclado

Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será
una posición del array del apartado 1) y se guardará en el array del apartado 2

Imprimir por pantalla las palabras generadas*/