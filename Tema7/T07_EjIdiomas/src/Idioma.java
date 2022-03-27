import java.util.ArrayList;

public abstract class Idioma {
    private String nombre;
    private int numeroHablantes;
    ArrayList<String> listaPalabras;

    public Idioma(){}
    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        listaPalabras = new ArrayList();
        saludar();
        despedir();
    }

    public abstract void saludar();
    public abstract void despedir();
    public void ingresarPalabra(String palabra){
        listaPalabras.add(palabra);
    }
    public void listarPalabras(){
        System.out.printf("Las palabras en %s son: ", nombre);
        for ( String item : listaPalabras ) {
            for (int i = 0; i < listaPalabras.size(); i++) {
                System.out.println(item);
            }
        }
    }

    //getter y setter
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

    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
