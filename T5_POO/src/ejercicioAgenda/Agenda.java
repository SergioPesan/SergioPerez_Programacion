package ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listado;

    //contructor
    public Agenda(){
        this.listado = new ArrayList();
    }


    //métodos
    public void agregar(Persona persona){
        listado.add(persona);
    }

    public void borrar(String dni){
        for (int i = 0; i < listado.size(); i++) {
            if(listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.remove(i);
            }
        }
    }

    public void editar(String dni){
        for (int i = 0; i < listado.size(); i++) {
            if(listado.get(i).getDni().equalsIgnoreCase(dni)){

            }
        }
    }
    public void buscar(String dni){
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.get(i);
            }
        }
    }

    public void listar(){
        for (Persona item:listado) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }
}
