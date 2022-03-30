package excepciones;

import java.io.IOException;

public class Entrada {
    public static void main(String[] args) throws IOException {
        String palabra = "Hola";
        String[] palabras = new String[]{"Uno", "Dos", "Tres","Cuatro"};
        try{
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        }catch (NullPointerException e){
            System.out.println("La palabra es nula");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("La palabra es nula");
        }/*catch (IndexOutOfBoundsException e){
            System.out.println("Error de acceso del array");
        }*/ finally {
            System.out.println("Ejecución obligatoria");
        }

        System.out.println("Bloque final");

        Coche coche = new Coche();

        try {
            coche.metodoUno();
        } catch (IOException e) {
            e.printStackTrace();
        }

        coche.metodoUno(); // throws IOException en el metodo main

        coche.metodoDos();




    }
}
