package ejercicioAsignaturas;

public class Entrada {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        //calificacion = 0      identificador = 1
        Asignatura entornos = new Asignatura(2);
        //calificacion = 0      identificador = 2
        Asignatura bbdd = new Asignatura(3);
        //calificacion = 0      identificador = 3

        Alumno alumno1 = new Alumno(programacion,entornos,bbdd);
        //as1 = programacion (//id=1 calificación = 0)
        //as2 = entornos (//id=1 calificación = 0)
        //as3 = sistemas (//id=1 calificación = 0)
        Alumno alumno2 = new Alumno(4,5,6);
        //as1 =  (//id=4 calificación = 0)
        //as2 =  (//id=5 calificación = 0)
        //as3 =  (//id=6 calificación = 0)

       /* alumno1.getAsignatura1().setCalificación(9);
        //asigna a programación en el alumno 1, una nota.
        alumno1.getAsignatura3().getCalificación();*/

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno1);
        System.out.println(alumno1.getAsignatura1().getCalificación());
        System.out.println(alumno1.getAsignatura2().getCalificación());
        System.out.println(alumno1.getAsignatura3().getCalificación());

        System.out.println(profesor.ponerNotas(alumno2));

        if(profesor.calcularMedia(alumno1)>=5){
            System.out.println("El alumno 1 pasa de curso");
        }else{
            System.out.println("El alumno 1 repite el curso");
        }


    }
}
