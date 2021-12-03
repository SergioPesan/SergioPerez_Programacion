package ejercicios2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        String frase, masLarga="", masCorta="mdhvbkjasvasvevanoidvagvehyddfbvdafbgkiaidgiudabgvr";
        int cuatroLetras = 0;

        System.out.println("Introduce la frase: ");
        frase = entradaTeclado.nextLine();

        String[] palabras = frase.split(" ");


        for (String item: palabras) {
            if(item.length() < masCorta.length() ){
                masCorta = item;
            }
            if(item.length() > masLarga.length() ){
                masLarga = item;
            }
            if (item.length() == 4) {
                cuatroLetras++;
            }
        }

        System.out.println("Las palabra más larga es: " + masLarga);
        System.out.println("La palabra más corta es: " + masCorta);
        System.out.println("Hay " + cuatroLetras + " palabras con cuatro letras, que son: ");

        for (String item:palabras) {
            if (item.length() == 4) {
                System.out.println(item);
            }
        }



        entradaTeclado.close();
    }
}
