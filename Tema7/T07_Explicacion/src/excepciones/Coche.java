package excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Coche {

    public void metodoUno() throws IOException {
        File file = new File("");
        FileWriter fw = new FileWriter(file);
    }

    public void metodoDos(){
        File file = new File("");
        try {
            FileWriter fw = new FileWriter(file);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error en fichero");
        }
    }

    public void metodoTres(){

    }

    public void metodoCueatro(){

    }
}
