package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosController {
    public void escrituraFichero(File file){
        Scanner scanner = new Scanner(System.in);

        String linea;
        int opcion;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            do { 
                System.out.println("Elige una opción");
                System.out.println("0. Terminar programa");
                System.out.println("1. Escribir una línea");
                opcion = scanner.nextInt();

                if (opcion == 1){
                    System.out.println("Escribe la linea que desees");
                    linea = scanner.next();
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }else if (opcion == 0){
                    System.out.println("Terminando programa");
                } else{
                    System.out.println("Esa opción no es correcta, intentelo de nuevo");
                }
            }while (opcion != 0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        scanner.close();
    }
}
