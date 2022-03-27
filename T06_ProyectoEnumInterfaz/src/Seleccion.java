import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Persona> listaPersonas;
    private int nivelAtaque;

    public Seleccion(){
        this.listaPersonas = new ArrayList();
    }

    public void añadirPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public void comprobarAtaque(){
        for ( Persona item : listaPersonas ) {
            if (!(item instanceof Entrenador)){
                nivelAtaque += ((Seleccionable)item).atacar();
            }
        }
        System.out.println("El nivel de ataque de la selección es: " + nivelAtaque);
    }

    public void repartirPrima(){
        for ( Persona item : listaPersonas ) {
            if(!(item instanceof Entrenador)){
                ((Seleccionable)item).repartirPrima();
            }
        }
    }

}
