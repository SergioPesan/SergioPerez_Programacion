public class Entrada {
    public static void main(String[] args) {

    Partido partido = new Partido();

    Partido.Equipo atleti = partido.new Equipo("Atleti");
    Partido.Equipo sevilla = partido.new Equipo("Sevilla");

    partido.mostrarResultado();

        System.out.println(" ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
            partido.agregarGolesLocal();
            partido.agregarGolesVisitante();
            }
            System.out.println("El resultado en la " + (i+1)+ "ª" + " parte es: ");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.escribirClasificacion();
        partido.reiniciarPartido();

        System.out.println(" ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                partido.agregarGolesLocal();
                partido.agregarGolesVisitante();
            }
            System.out.println("El resultado en la " + (i+1)+ "ª" + " parte es: ");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.escribirClasificacion();



    }
}
