import controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;

        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\ficherosExp\\fichero.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\ficherosExp");
        directory2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\ficherosExp\\ficherosNuevo");

        FicherosController ficherosController = new FicherosController();
        // ficherosController.getFileInfo(directory);
        ficherosController.getDirectoryInfo(directory);

        /*if(!file.exists()){ // Para crear un fichero nuevo
            try{
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }finally {
                System.out.println("Se ha creado un nuevo fichero");
            }
        }*/





    }
}
