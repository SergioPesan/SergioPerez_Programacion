package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioController {
    File file = new File("src/resources/objetosEjercicio.bin");
    Usuario usuario;
    ArrayList listaUsuarios;
    public EjercicioController() {
        ArrayList listaUsuarios;
    }

    public void writeBinario(){
        Scanner scanner = new Scanner(System.in);
        ObjectOutputStream oos = null; //OBJETO QUE HAY QUE CERRAR
        String nombre, apellido, password;
        int opcion;



        System.out.println("0. Terminar programa");
        System.out.println("1. Nuevo usuario");
        opcion = scanner.nextInt();


        while (opcion != 0){

            System.out.println("Introduce el nombre");
            nombre = scanner.next();
            System.out.println("Introduce el apellido");
            apellido = scanner.next();
            System.out.println("Introduce la contraseña");
            password = scanner.next();

            try {
                oos = new ObjectOutputStream(new FileOutputStream(file,true));
                listaUsuarios.add(new Usuario(nombre, apellido, password));

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
            System.out.println("0. Terminar programa");
            System.out.println("1. Nuevo usuario");
            opcion = scanner.nextInt();
        }

        for ( Object usuario : listaUsuarios ) {
            System.out.println(usuario.toString());
        }
        System.out.println("El programa ha terminado");


        scanner.close();
    }
    public void mostrarDatosUsuario(){
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: "+ usuario.getApellido());
        System.out.println("Contraseña: " + usuario.getPassword() );
    }

    public void readBinario(){
        ObjectInputStream ois= null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario item = null;
            while ((item = (Usuario) ois.readObject()) != null){
                mostrarDatosUsuario();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
