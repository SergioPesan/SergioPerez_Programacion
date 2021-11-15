package ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int modificaciones = 0;

        System.out.println("Números aleatorios");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random()*31);
            System.out.println(numero[i]);
        }

        System.out.println("Numeros modificados");

        for (int i = 0; i < numero.length; i++) {
            if(numero[i] == 6){
                numero[i] = 8;
                modificaciones++;
            }
            if(numero[i] == 7){
                numero[i] = 15;
                modificaciones++;
            }
            if(numero[i] == 20){
                numero[i] = 10;
                modificaciones++;
            }
            System.out.println(numero[i]);
        }
        System.out.printf("Ha habido %d modificaciones", modificaciones);
    }
}

/* Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:

modificar todos los 6 por 8
modificar todos los 7 por 15
modificar todos los 20 por 10 */
