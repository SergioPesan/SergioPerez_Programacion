package ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listado;

    //contructor
    public Agenda(){
        this.listado = new ArrayList();
    }


    //métodos
    /*public void agregar(Persona persona){
        boolean existe = false;

        for ( Persona item : listado) {
            if (item.getDni() == persona.getDni()){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("La persona ya existe");
        }else{
            listado.add(persona);
        }
    }*/

    public void agregar(Persona persona){
        if (existePersona(persona.getDni()).equals(null)){
            listado.add(persona);
        }else {
            System.out.println("La persona ya existe");
        }
    }

    public void borrar(String dni){
        /*
        for (int i = 0; i < listado.size(); i++) {
            if(listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.remove(i);
                break;
            }
        }*/

        if(existePersona(dni) != null) {
            listado.remove(existePersona(dni));
            //return true;
        }
        //return false;
    }

    public void editar(String dni){
        /*for (Persona persona: listado){
            if (persona.getDni().equalsIgnoreCase(dni)) {
                persona.setNombre("Otro nombre");
                persona.setTelefono(123123);
                break;

            }
        }*/

        if (existePersona(dni) != null){
            Persona personaEncontrada = existePersona(dni);
            personaEncontrada.setNombre("Nuevo");
            personaEncontrada.setDni("ASD");
            personaEncontrada.setTelefono(123123);
        }
    }
    public void buscar(String dni){
        /*for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.get(i);
                break;
            }
        }*/

        if(existePersona(dni) != null){
            existePersona(dni).mostrarDatos();
        }
    }

    public void listar(){
        for (Persona item:listado) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    private Persona existePersona(String dni){
        Persona persona = null;

        for (Persona item:listado) {
            if(item.getDni().equalsIgnoreCase(dni)){

                /*persona = item;
                break; //Es correcto pero mejor usar return item; */

                return item;
            }
        }
        return persona;
    }
}
