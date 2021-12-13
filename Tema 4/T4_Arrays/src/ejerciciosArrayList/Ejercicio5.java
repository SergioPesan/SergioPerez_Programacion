package ejerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList();

        palabras.add("Esto");
        palabras.add("es");
        palabras.add("un");
        palabras.add("ejercicio");
        palabras.add("para ");
        palabras.add("practicar");
        palabras.add("los");
        palabras.add("ArrayList");
        palabras.add("en");
        palabras.add("programación");

        int min = 99999, max = -99999;

        String palabraLarga = "", palabraCorta = "ngfoiernqgroqngioqnergoindqthqrehqehe";

        for (String item: palabras) {
            System.out.println(item + " tiene " + item.length() + " letras");

            if (item.length() > max){
                max = item.length();
            }
            if (item.length() < min){
                min = item.length();
            }
        }

        System.out.println("La palabra con más letras es: " + max);
        System.out.println("La palabra con menos letras es: " + min);

    }
}
