package ejerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numero1 = new ArrayList();
        ArrayList<Integer> numero2 = new ArrayList();

        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));
        numero1.add((int) (Math.random()*6));

        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));
        numero2.add((int) (Math.random()*6));

        System.out.println(numero1);
        System.out.println(numero2);


        for (int i = 0; i < numero1.size(); i++) {
            if (numero1.get(i) == numero2.get(i)){
                System.out.println("Los numeros de la posición " + i + " son iguales");
            }
        }

    }
}
