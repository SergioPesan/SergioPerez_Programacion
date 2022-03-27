import java.util.ArrayList;

public class Torneo {

    // Atributos
    private ArrayList<Partido> listaEquipos, listaPartidos;
    private String nombreTorneo;

    // Constructores

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
        listaEquipos = new ArrayList();
        listaPartidos = new ArrayList();
    }

    public void realizarSorteo(ArrayList<Equipo> lista){
        //System.out.println(lista.size());

        /*for ( Equipo item : lista ) {
            System.out.println(item);
        }*/

        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i+1; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1,equipo2));
            }
        }

        for (int i = lista.size() - 1; i == 0 ; i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i - 1; j == 0; j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }
    }

    public void iniciarTorneo(){
        for ( Partido item : listaPartidos ) {
            item.jugarPartido();
        }
    }

    // Getter & Setter
    public ArrayList getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public String getNombre() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    // Clase anidada
    class Partido{

        //Atributos
        private Equipo equipoLocal, equipoVisitante;
        private boolean jugado;
        private int numeroGoles;

        // Constructores
        public Partido() {}

        public Partido(boolean jugado, int numeroGoles) {
            this.jugado = jugado;
            this.numeroGoles = numeroGoles;
        }

        // Métodos

        public void agregarGolesLocal(){}

        public void agregarGolesVisitante(){}

        public void mostrarResultado(){}

        // Getter & Setter
        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public int getNumeroGoles() {
            return numeroGoles;
        }

        public void setNumeroGoles(int numeroGoles) {
            this.numeroGoles = numeroGoles;
        }
    }

    // Segunda clase anidada
    static class Equipo{
        // Atributos
        private int golesEncuentro, puntos, nivelAtaque, nivelDefensa;
        private String nombreEquipo;

        // Constructores


        public Equipo() {
        }

        public Equipo(int nivelAtaque, int nivelDefensa, String nombreEquipo) {
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
            this.nombreEquipo = nombreEquipo;
        }

        // Getter & Setter

        public int getNivelAtaque() {
            return nivelAtaque;
        }

        public void setNivelAtaque(int nivelAtaque) {
            this.nivelAtaque = nivelAtaque;
        }

        public int getNivelDefensa() {
            return nivelDefensa;
        }

        public void setNivelDefensa(int nivelDefensa) {
            this.nivelDefensa = nivelDefensa;
        }

        public String getNombreEquipo() {
            return nombreEquipo;
        }

        public void setNombreEquipo(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
        }
    }

}
