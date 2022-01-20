package ejercicioAsignaturas;

public class Asignatura {

    //atributos
    private int id;
    private double calificacion;

    //constructor
    public Asignatura(int id){
        this.id = id;
    }

    //getter

    public int getIdentificador() {
        return id;
    }

    public double getCalificación() {
        return calificacion;
    }

    //setter

    public void setCalificación(double calificación) {
        this.calificacion = calificación;
    }
}
