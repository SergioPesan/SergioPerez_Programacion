import controller.FicherosController;

import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        File file = null;

        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\fichero1.1.txt");

        FicherosController ficherosController = new FicherosController();

        ficherosController.escrituraFichero(file);
    }
}
