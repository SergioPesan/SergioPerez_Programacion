import java.util.ArrayList;

public class Torneo {

    //atributos
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Partido> listaPartidos;
    private String nombre;

    //constructor

    public Torneo(String nombre) {
        this.nombre = nombre;
        listaPartidos = new ArrayList();
    }

    //métodos

    public void realizarSorteo(ArrayList<Equipo> lista) {
        this.listaEquipos = lista;

        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(i);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }

        for (int i = lista.size() - 1; i >= 0; i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i - 1; j >= 0; j++) {
                Equipo equipo2 = lista.get(i);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }

    }
    

    class Partido {
        private Equipo equipoLocal, equipoVisitante;
        private int golesLocal, golesVisitante;
        private boolean jugado;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

        public void generarGolLocal() {
            if (equipoLocal.getNivelAtaque() > equipoVisitante.getNivelAtaque()) {
                golesLocal = (int) (Math.random() * 3);
                equipoLocal.setGolesTotal(equipoLocal.getGolesTotal() + golesLocal);
            }
        }

        public void generarGolVisitantes() {
            if (equipoVisitante.getNivelAtaque() > equipoLocal.getNivelAtaque()) {
                golesVisitante = (int) (Math.random() * 3);
                equipoVisitante.setGolesTotal(equipoVisitante.getGolesTotal() + golesVisitante);
            }
        }

        public void jugarPartido() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    generarGolLocal();
                    getEquipoVisitante();
                }
            }
            jugado = true;
            if (golesVisitante > golesLocal) {
                equipoVisitante.setPuntos(equipoVisitante.puntos + 3);
            } else if (golesLocal > golesVisitante) {
                equipoLocal.setPuntos(equipoLocal.puntos + 3);
            } else {
                equipoLocal.setPuntos(equipoLocal.puntos + 1);
                equipoVisitante.setPuntos(equipoVisitante.puntos + 1);
            }
        }

        public Equipo getEquipoLocal() {
            return equipoLocal;
        }

        public void setEquipoLocal(Equipo equipoLocal) {
            this.equipoLocal = equipoLocal;
        }

        public Equipo getEquipoVisitante() {
            return equipoVisitante;
        }

        public void setEquipoVisitante(Equipo equipoVisitante) {
            this.equipoVisitante = equipoVisitante;
        }
    }

    static class Equipo {
        private String nombre;
        private int nivelAtaque, nivelDefensa;
        private int puntos;
        private int golesTotal;


        public Equipo(String nombre, int nivelAtaque, int nivelDefensa) {
            this.nombre = nombre;
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
        }


        public int getGolesTotal() {
            return golesTotal;
        }

        public void setGolesTotal(int golesTotal) {
            this.golesTotal = golesTotal;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

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
    }
}
