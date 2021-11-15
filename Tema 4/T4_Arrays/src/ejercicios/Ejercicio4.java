package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*101);
            System.out.print(numeros + "\t");

        }

        for (int i = 0; i < cuadrados.length; i++) {
            cuadrados[i] = (int) Math.pow(numeros[i], 2);
            System.out.print(cuadrados + "\t");
        }

        for (int i = 0; i < cubos.length; i++) {
            cubos[i] = (int) Math.pow(numeros[i], 3);
            System.out.print(cubos + "\t");
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d \t %d \t %d%n",numeros[i], cuadrados[i], cubos[i]);
        }
    }
}

/*Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.

En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
En el array cubo se deben almacenar los cubos de los valores que hay en numero.*/