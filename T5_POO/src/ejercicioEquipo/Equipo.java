package ejercicioEquipo;

public class Equipo {
    //atributos
    String nombre;
    int nivelAtaque, nivelCentro, nivelDefensa, goles;

    //constructores
    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    //métodos
    public void atacar(){
        boolean gol = false;

        if((nivelAtaque*(int)(Math.random()*2)) + (nivelCentro*(int)(Math.random()*2)/2) > 90){
            gol = true;
            goles += 1;
        }else{
            gol = false;
        }
    }

}
