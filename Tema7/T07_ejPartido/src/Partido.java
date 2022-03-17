public class Partido {

    //atributos
    private Equipo equipoLocal, EquipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    //Métodos
    public void agregarGolesLocal(){
        golesLocal += (int)(Math.random()*2);
    }

    public void agregarGolesVisitante(){
        golesVisitante += (int)(Math.random()*2);
    }

    public void mostrarResultado(){
        System.out.println(equipoLocal.getNombre() + " " + golesLocal + " - " +
                golesVisitante + " " + getEquipoVisitante().getNombre());
    }

    //Getter y Setter
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        EquipoVisitante = equipoVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    //Clase anidada
    class Equipo{

        //Atributos
        int puntos;
        String nombre;

        //Constructores
        public Equipo(){}
        public Equipo(int puntos, String nombre) {
            this.puntos = puntos;
            this.nombre = nombre;
            setEquipoLocal(this);
            setEquipoVisitante(this);
        }

        //Getter y Setter
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
    }
}
