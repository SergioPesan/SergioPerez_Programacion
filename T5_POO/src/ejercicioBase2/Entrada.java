package ejercicioBase2;

import ejerciciosBase.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = entradaTeclado.next();
        System.out.println("Introduce el apellido");
        String apellido = entradaTeclado.next();
        System.out.println("Introduce el dni");
        String dni = entradaTeclado.next();
        System.out.println("Introduce la edad");
        int edad = entradaTeclado.nextInt();
        System.out.println("Introduce el peso");
        double peso = entradaTeclado.nextDouble();
        System.out.println("Introduce la altura");
        int altura = entradaTeclado.nextInt();

        Persona personaMano = new Persona();
        Persona personaSola = new Persona();

        System.out.println("Persona a mano");
        personaMano.mostrarDatos();

        System.out.println("Persona sin nada");
        personaSola.mostrarDatos();

        entradaTeclado.close();
    }
}
