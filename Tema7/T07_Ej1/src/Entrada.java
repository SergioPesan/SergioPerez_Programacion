import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int numeroIntroducido = 0, intentos = 0;
        int aleatorio = (int)(Math.random()*11);
        System.out.println(aleatorio);

        do {
            try{
                System.out.println("Introduce numero a jugar");
                entradaTeclado = new Scanner(System.in);
                numeroIntroducido = entradaTeclado.nextInt();
                if (numeroIntroducido < 0){
                    throw new ExceptionNumero("Número inferior a 0");
                }
            }catch (InputMismatchException | ExceptionNumero e){
                System.out.println(e.getMessage());
            }finally {
                intentos++;
            }
        }while (numeroIntroducido != aleatorio);

        System.out.printf("Numero acertado en %d intentos",intentos);

        entradaTeclado.close();
    }
}
