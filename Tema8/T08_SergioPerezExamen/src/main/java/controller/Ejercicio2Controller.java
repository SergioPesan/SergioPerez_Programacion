package controller;

import model.Personaje;

import java.io.*;

public class Ejercicio2Controller {
    public void leerBin(){
        File file = new File("src/main/resources/personajes_vf.bin");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));

            Personaje personajeLectura = null;

            try {
                while ((personajeLectura = (Personaje) ois.readObject())!= null){
                    System.out.println(personajeLectura.getName());
                    System.out.println(personajeLectura.getPhoto());
                }
            }catch (EOFException e){
                System.out.println("Fichero terminado");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
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
