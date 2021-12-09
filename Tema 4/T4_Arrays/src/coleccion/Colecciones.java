package coleccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        // lista de cualquier tipo > OBJECT.
        ArrayList listaCosas = new ArrayList(); // Arraylist() es un método constructor.

        // para poder saber su tamaño -> .size()
        listaCosas.size(); // --> 0
        int tamanio = listaCosas.size();
        System.out.println("Tamaño sin elementos en la array: " + tamanio);

        // añado un elemento a la lista -> .add()
        listaCosas.add(5);

        //tamaño
        tamanio = listaCosas.size();
        System.out.println("Tamaño después de añadir un elemento: " + tamanio);


        listaCosas.add("Borja");
        tamanio = listaCosas.size();
        System.out.println("Tamaño con dos elementos: " + tamanio);

        //Sacar el elemento en una posicion concreta -> .get()
        String numero = String.valueOf(listaCosas.get(1) );
        System.out.println("El valor de la posición 0 es: " + numero);

        listaCosas.add(8);
        listaCosas.add(6);
        listaCosas.add(true);
        listaCosas.add("Sergio");
        listaCosas.add(6);
        listaCosas.add(7.3);
        listaCosas.add(false);
        listaCosas.add(6);

        // Sacar de golpe todos los elementos del array (con for)
        /*for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i+1 + " - " + listaCosas.get(i));
        }*/

        //(con foreach)
        int posiciones = 1;
        for (Object item: listaCosas) {
            System.out.println(posiciones + " - " + item);
            posiciones++;
        }

        /*Buscar dentro de una lista una palabra, por ejemplo "Sergio".
        Cuando la encuentre sacar el mensaje.
        Palabra encontrada y la posicion de la misma.
         */

        /*for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.size(i).eq){
                System.out.println(i + " - " + listaCosas.get(i));
            }
        }*/

        for (Object item: listaCosas) {
            if (item.equals("Hola")){
                System.out.println("Palabra encontrada");
                System.out.println(posiciones + " - " + item);
            }
        }

        int posicionElemento = listaCosas.indexOf("Sergio");

        if (posicionElemento > -1){
            System.out.println("Palabra encontrada");
            System.out.println("En la posicion" + posicionElemento);
        }

        /*pedir por consola una palabra a buscar, en caso de que la palabra se encuentre en la lista,
         se modifique por otro se modifica el valor por otro que se pida por consola y se agregara al final*/

        /*System.out.println("Introduce una palabra");
        Object palabraTeclado = entradaTeclado.next();

        int posicionEncontrada = listaCosas.indexOf(palabraTeclado);
        if (posicionEncontrada > -1){
            System.out.println("Palabra encontrada, introduce una palabra para cambiarla");
            String palabraSustituir = entradaTeclado.next();

            listaCosas.set(posicionEncontrada, palabraSustituir);
        }else{
            System.out.println("La palabra no existe así que se añadirá al final de la lista");
            listaCosas.add(palabraTeclado);
        }

        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i + 1 + " - " + listaCosas.get(i));
        }*/
        System.out.println(" ");
        System.out.println("El tamaño actual es de: " + listaCosas.size());
        listaCosas.remove(new Integer(5));// elimina objeto
        listaCosas.remove(5); // elimina posicion
        //Usar siempre la posición, es más efectivo.
        System.out.println(listaCosas);

        //Borrar todos los 6
        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(6)){
                listaCosas.remove(i);
            }
        }
        System.out.println(listaCosas);

        entradaTeclado.close();
    }
}