package ejercicioEquipo;

public class Entrada {
    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Betis");
        Equipo equipoB = new Equipo("Albecete",);

        for (int i = 0; i < 2; i++) {
            equipoA.atacar();
            equipoB.atacar();

            System.out.printf("El resultado es EquipoA %d - %d EquipoB", equipoA, equipoB);
        }

    }
}
