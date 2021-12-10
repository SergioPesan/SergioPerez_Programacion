package ejerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList();

        nombre.add("Alex");
        nombre.add("Marcos");
        nombre.add("Patricia");
        nombre.add("Andrea");
        nombre.add("Zama");
        nombre.add("Ángel");

        System.out.println(nombre.get((int)(Math.random()* nombre.size())));

    }
}
