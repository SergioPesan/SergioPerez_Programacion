import java.util.ArrayList;

public final class Supermercado<T> {

    // atributos
    private ArrayList<T> listaGenero;

    // constructores
    public Supermercado() {
        this.listaGenero = new ArrayList<>();
    }

    // métodos
    public void anadirGenero(T genero){
        listaGenero.add(genero);
    }

    public void listarDatos(){
        for ( T item : listaGenero ) {
            if (item instanceof Mueble){
                ((Mueble) item).mostrarDatos();
            } else if (item instanceof Alimento){
                ((Alimento) item).mostrarDatos();
            }
        }
    }

    public void mostrarPreciosFinales(){
        double precioTotal = 0;

        for ( T item : listaGenero ) {
            if (item instanceof Mueble){
                precioTotal += ((Mueble) item).getPrecio();
            } else if (item instanceof Alimento){
                precioTotal += ((Alimento) item).getPrecio();
            }
        }

        System.out.println(precioTotal);
    }

}
