package ejercicios2;

public class Ejercicio12 {
    public static void main(String[] args) {

        int posicionUno =0, posicionDos=0;
        String[] bomboUno = {"Barcelona", "PSG", "Manchester City", "Juventus","RB Leizpzig", "Valencia", "Liverpool"};
        String[] bomboDos = {"Real Madrid", "Tottenham", "Nápoles", "B.Dortmund", "O.Lyon","Chelsea","Atalanta","Atlético de Madrid"};

        String[] equiposSalidosB1 = new String[bomboUno.length];
        String[] equiposSalidosB2 = new String[bomboDos.length];

        for (int i = 0; i < bomboUno.length + 1; i++) {
            posicionUno = (int) (Math.random()* bomboUno.length + 1);
            posicionDos = (int) (Math.random()* bomboDos.length + 1);
            String equipoGenerado1 = bomboUno[posicionUno];
            String equipoGenerado2 = bomboDos[posicionDos];

            for (int x = 0; x < equiposSalidosB1.length; x++) {
                if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[i])){
                    posicionUno = (int) (Math.random()* bomboUno.length + 1);
                }
            }

            System.out.println("*** " + bomboUno[posicionUno] + " - " + bomboDos[posicionDos] + " ***");
        }

    }
}
