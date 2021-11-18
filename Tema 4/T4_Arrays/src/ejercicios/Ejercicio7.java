package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);


        int sumaLetras = 0;

        String[] palabra = new String[10];

        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Escribe una palabra");
                palabra[i] = entradaTeclado.next();
        }

        do {
            int opcion;

            System.out.println("Elige una opción");
            System.out.printf("\t");
            System.out.println("1.Ver palabras");
            System.out.println("2. Obtener aleatoria");
            System.out.println("3. Ver número de letras");
            System.out.println("4. Ver media de letras");
            System.out.println("5. Ver palabra con más letras");
            System.out.println("6. Ver palabra con menos letras");



        }while (opcion !=0);

        switch (opcion != 0){
            case 1:
                System.out.println("Vas a mostrar las palabras");
                for (int i = 0; i < palabra.length; i++) {
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Vas a obtener una palabra aleatoria");
                // 10 posiciones -> 0-9
                int aleatorio = (int) (Math.random()*10);
                System.out.println("La palabra aleatoria es: " + palabra[aleatorio]);
                break;
            case 3:
                for (String item: palabra) {
                    sumaLetras += item.length();
                }
                System.out.println("El número total de letras es: " + sumaLetras);
                break;
            case 4:
                if(sumaLetras == 0){
                    System.out.println("El número de ltras es o, posiblemente no las has contado");
                }else{
                    System.out.println("El número medio de letras: " + sumaLetras/ palabra.length);
                }
                break;
            case 5|6:
                
                String pequenia=palabra[0], grande=palabra[0];

                for (String item: palabra) {
                    if(item.length()>grande.length()){
                        grande = item;
                    }
                    if (item.length()<pequenia.length()){
                        pequenia = item;
                    }
                }
                break;
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