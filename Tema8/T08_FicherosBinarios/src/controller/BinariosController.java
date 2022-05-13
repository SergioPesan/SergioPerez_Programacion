package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario() {
        // ABSOLUTA --> DESDE LA RAÍZ "C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\ficheros2.1.txt"
        //RELATIVA --> DESDE DONDE ESTOY UBICADO "src/controller/BinariosController.java"

        File file = new File("src/resources/objetos.bin");
        ObjectOutputStream oos = null; //OBJETO QUE HAY QUE CERRAR

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file, true));
            oos.writeObject(new Usuario("Sergio", "Pérez", "1234A"));
            oos.writeObject(new Usuario("Pedro", "Herrera", "5678B"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void lecturaBinario() {
        File file = new File("src/resources/objetos.bin");

        ObjectInputStream ois = null;
        Usuario usuarioLectura = null;

        try {
            try {
                ois = new ObjectInputStream(new FileInputStream(file));
                while ((usuarioLectura = (Usuario) ois.readObject()) != null) {
                    System.out.println(usuarioLectura);
                }
            } catch (EOFException e) {
                System.out.println("Fichero terminado");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

}
