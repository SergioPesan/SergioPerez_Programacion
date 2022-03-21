public final class Partido {

    //atributos
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    //Métodos
    public void agregarGolesLocal(){
        golesLocal += (int)(Math.random()*3);
    }

    public void agregarGolesVisitante(){
        golesVisitante += (int)(Math.random()*3);
    }

    public void mostrarResultado(){
        System.out.println(equipoLocal.getNombre() + " " + golesLocal + " - " +
                golesVisitante + " " + getEquipoVisitante().getNombre());

        /*System.out.printf("%s: %d - %s: %d",equipoLocal.getNombre(),
                golesLocal, golesVisitante, equipoVisitante.getNombre());*/
    }

    public void repartirPuntos(){
        if (golesVisitante > golesLocal){
            this.equipoVisitante.setPuntos(equipoVisitante.getPuntos()+3);
        }else if (golesLocal > golesVisitante){
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+3);
        }else if (golesLocal == golesVisitante){
            this.equipoVisitante.setPuntos(equipoVisitante.getPuntos()+1);
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
        }
    }

    public void escribirClasificacion(){
        if (equipoLocal.getPuntos()>equipoVisitante.getPuntos()){
            System.out.println("1- Atleti: "+equipoLocal.getPuntos());
            System.out.println("2- Sevilla: "+equipoVisitante.getPuntos());
        }else if (equipoLocal.getPuntos()<equipoVisitante.getPuntos()){
            System.out.println("1- Sevilla: "+equipoVisitante.getPuntos());
            System.out.println("2- Atleti: "+equipoLocal.getPuntos());
        }
    }

    public void reiniciarPartido(){
        setGolesLocal(0);
        setGolesVisitante(0);
    }

    //Getter y Setter
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
        public Equipo(String nombre) {
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("Atleti")){
                setEquipoLocal(this);
            }else if (nombre.equalsIgnoreCase("Sevilla")){
                setEquipoVisitante(this);
            }


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
