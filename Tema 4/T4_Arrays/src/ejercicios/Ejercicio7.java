package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        String[] palabra = new String[10];

        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Escribe una palabra");
                palabra[i] = entradaTeclado.next();
        }
        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
        }



        entradaTeclado.close();
    }
}


/* Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:

    Ver todas las palabras: mostrarla todas las palabras del array

    Obtener una palabra al azar: mostrará una palabra de las que existen en el array

    Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras

    Ver media de letras: mostrará el número medio de letras entre todas las palabas

    Ver palabra con más letras

    Ver palabra con menos letras */