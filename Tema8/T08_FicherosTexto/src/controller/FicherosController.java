package controller;

import java.io.*;

public class FicherosController {

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero");
        System.out.println("¿Es directorio? " + file.isDirectory());
        System.out.println("¿Es fichero? " + file.isFile());
        System.out.println("¿Existe? " + file.exists());
        System.out.println("Padre: " + file.getParent());
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());
        System.out.println("Ruta Relativa: " + file.getPath());
    }

    public void getDirectoryInfo(File file){
        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        if (file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();

            for ( File fichero : ficheros ) {
                System.out.println(fichero); // daca la posicion
                System.out.println(fichero.getName()); // saca el nombre del archivo
            }






        }
    }

    public void lecturaFichero(File file){

        FileReader fileReader = null;


        try {
            int lectura =0;
            fileReader = new FileReader(file);
            while((lectura = fileReader.read()) != -1){
                lectura = fileReader.read();
                System.out.println((char)lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) { // "Exception e" son todas las excepciones juntas
                e.printStackTrace();
            }
        }

    }

    public void lecturaBuffer(File file){

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura = bufferedReader.readLine())!=null){
                //lectura = bufferedReader.readLine();
                System.out.println(lectura);
                lecturaCompleta += lectura;
                lecturaCompleta+="\n";
            }

            System.out.println("La lectura completa es: ");
            System.out.println(lecturaCompleta);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escrituraFichero(File file){
        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Ejemplo \n");
            fileWriter.write("Esto es una nueva línea en el fichero");
            fileReader = new FileReader(file);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
