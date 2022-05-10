package controller;

import java.io.*;

public class Ejercicio1Controller {
    public void leerArchivo(){
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\T08_ExamenSergioPerez\\fichero_cifrado.txt");
        FileReader fileReader = null;
        BufferedReader br = null;

        try {
            int linea;
            fileReader = new FileReader(file);
            br = new BufferedReader(new FileReader(file));
            // System.out.println(fileReader.read());
            while ((linea = fileReader.read()) >-1){
                int mensaje = linea /2;
                //System.out.println(mensaje); //mensaje en código ASCII
                System.out.println(Character.toString(mensaje));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
