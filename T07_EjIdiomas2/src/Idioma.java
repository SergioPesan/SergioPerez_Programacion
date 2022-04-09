import java.util.ArrayList;

public abstract class Idioma {

    // atributos
    private String nombre;
    private int numeroHablantes;
    private ArrayList<String> listaPalabras;

    // constructores

    public Idioma() {
    }

    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        listaPalabras = new ArrayList();
    }

    // métodos

    public abstract void saludar();
    public abstract void despedir();

    public void ingresarPalabra(String palabra){
        listaPalabras.add(palabra);
    }

    public void listarPalabras(){
        for ( String item : listaPalabras ) {
            System.out.printf("Las palabras en %d son:", item);
        }
    }

    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList getlistaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ArrayList listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
