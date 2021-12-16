package ejerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17Agenda {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        ArrayList<Object[]> listaPersonas = new ArrayList<>();
        String nombre = "", apellido = "", dni = "";
        int telefono = 0, opcion = 0;

        System.out.println("0.Terminar programa");
        System.out.println("1. Agregar persona");
        System.out.println("2. Buscar persona");
        System.out.println("3. Borrar persona");
        System.out.println("4. Listar persona");

        do{
            System.out.println("Escoge una opcion");
            opcion = entradaTeclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = entradaTeclado.next();
                    System.out.println("Introduce el apellido");
                    apellido = entradaTeclado.next();
                    System.out.println("Introduce el teléfono");
                    telefono = entradaTeclado.nextInt();
                    System.out.println("Introduce el dni");
                    dni = entradaTeclado.next();

                    boolean existe = false;

                    for (Object[] item: listaPersonas) {
                        if (item[3].toString().equalsIgnoreCase(dni)){
                            existe = true;
                            System.out.println("Ya esta registrada la persona y sus datos son:");
                            System.out.println("Nombre: " + item[0]
                                    + "  Apellido: " + item[1]
                                    + "    Teléfono: " + item[2]
                                    + "     dni: " + item[3]);
                            break;
                        }
                    }
                    if (!existe){
                        listaPersonas.add(new Object[]{nombre,apellido, telefono,dni});
                        System.out.println("Se ha registrado a la persona");
                    }
                    break;

                case 2:
                    System.out.println("Introduce el dni de la persona que deseaas buscar");
                    dni = entradaTeclado.next();
                    boolean encontrado = false;

                    for (Object[] persona: listaPersonas) {
                        if (persona[3].equals(dni)){
                            encontrado = true;
                            for (Object item: persona) {
                                System.out.print("\t" + item);
                            }
                            System.out.println();
                        }

                    }
                    if (!encontrado){
                        System.out.println("No se ha encontrado ese dni");
                    }

                    break;

                case 3:
                    System.out.println("Introduce el dni de la persona que deseaas eliminar");
                    dni = entradaTeclado.next();
                    encontrado = false;

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        if (listaPersonas.get(i)[3].toString().equalsIgnoreCase(dni)){
                            encontrado = true;
                            listaPersonas.remove(i);
                            System.out.println("Se ha eliminado a la persona que has seleccionado");
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("No se ha encontrado ese dni");
                    }

                    break;

                case 4:
                    if (listaPersonas.size()>0) {
                        for (Object[] persona : listaPersonas) {
                            System.out.println("Nombre: " + persona[0] + "  Apellido: " + persona[1] + "    Teléfono: " + persona[2]);
                        }
                    }else{
                        System.out.println("No hay ninguna persona registrada");
                    }
                    break;

            }

        }while(opcion != 0);

        entradaTeclado.close();
    }
}
