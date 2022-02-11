import java.util.ArrayList;

public class Concesionario{
    private ArrayList<Coche> listaCoches;


    public Concesionario(){
        listaCoches = new ArrayList<>();
    }

    // Métodos

    public void agregarCoche(Coche c){
        //listaCoches.add(c);

        if(existeCoche(c.getMatricula())==null){
            listaCoches.add(c);
        }
    }

    public Coche existeCoche(String matricula){
        boolean existe = false;
        Coche cocheEncontrado = null;

        for (Coche coche: listaCoches) {
            if (matricula.equalsIgnoreCase(coche.getMatricula())){
                System.out.println("El coche ya está en la lista");
                cocheEncontrado = coche;
                existe = true;
                return cocheEncontrado;
            }
        }
        return cocheEncontrado;


    }

    public void buscar(String matricula){
        for (int i = 0; i < listaCoches.size(); i++) {
            if (listaCoches.get(i).getMatricula().equalsIgnoreCase(matricula)){
                System.out.println(listaCoches.get(i));
            }
        }
    }

    public void borrar(String matricula){
        if (existeCoche(matricula) != null){
            listaCoches.remove(existeCoche(matricula));
            System.out.println("Coche borrado");
        }else {
            System.out.println("Coche no encontrado");
        }
    }

    public void clasificar(){

    }

    public void listar(){
        for (Coche coche : listaCoches) {
            coche.mostrarDatos();
        }
    }

}
