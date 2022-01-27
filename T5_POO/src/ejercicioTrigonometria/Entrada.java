package ejercicioTrigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        int opcion;


        do {
            System.out.println("1. Trabajar con triángulos");
            System.out.println("2. Trabajar con cículos");
            System.out.println("3. Trabajar con cuadrados");
            System.out.println(" ");
            System.out.println("Selecciona una opción ");
            opcion = entradaTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la base del triángulo");
                    int base = entradaTeclado.nextInt();
                    System.out.println("Introduce la altura del triángulo");
                    int altura = entradaTeclado.nextInt();

                    Triangulo triangulo = new Triangulo(base,altura);

                    do {
                        System.out.println("1. Calcular area");
                        System.out.println("2. Mostrar datos");
                        opcion = entradaTeclado.nextInt();
                        switch (opcion){
                            case 1:
                                triangulo.areaTriangulo();
                                break;
                            case 2:
                                break;
                        }
                    }while (opcion!=0);


                    //System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 2:
                    System.out.println("");
                    int radio = entradaTeclado.nextInt();

                    Circulo areaCirculo = new Circulo();
                    break;
                case 3:

                    break;
            }
        }while(opcion >= 1 && opcion <= 3);
        entradaTeclado.close();
    }
}
