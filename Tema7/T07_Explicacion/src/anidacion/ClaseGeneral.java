package anidacion;

public class ClaseGeneral {

    private String nombre;
    private int numero;
    private boolean acierto;
    private ClaseAnidada claseAnidada;

    public ClaseGeneral() {
    }

    public ClaseGeneral(String nombre, int numero, boolean acierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
    }

    public void mostrarDatosGeneral(){
        System.out.println("Nombre General: " + nombre);
        System.out.println("Número General:" + numero);
        System.out.println("Acierto General: " + acierto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    public ClaseAnidada getClaseAnidada() {
        return claseAnidada;
    }

    public void setClaseAnidada(ClaseAnidada claseAnidada) {
        this.claseAnidada = claseAnidada;
    }

    class ClaseAnidada{
        String nombreHija;
        int numeroHija;
        boolean aciertoHija;

        public ClaseAnidada(String nombreHija, int numeroHija, boolean aciertoHija) {
            this.nombreHija = nombreHija;
            this.numeroHija = numeroHija;
            this.aciertoHija = aciertoHija;
            setClaseAnidada(this);
        }

        public void mostrarDatosHija(){
            System.out.println("Nombre hija: " + nombreHija);
            System.out.println("Numero hija: " + numeroHija);
            System.out.println("Acierto hija: " + aciertoHija);
        }

        public void accesoGeneral(){
            mostrarDatosGeneral();
        }

        public String getNombreHija() {
            return nombreHija;
        }

        public void setNombreHija(String nombreHija) {
            this.nombreHija = nombreHija;
        }

        public int getNumeroHija() {
            return numeroHija;
        }

        public void setNumeroHija(int numeroHija) {
            this.numeroHija = numeroHija;
        }

        public boolean isAciertoHija() {
            return aciertoHija;
        }

        public void setAciertoHija(boolean aciertoHija) {
            this.aciertoHija = aciertoHija;
        }
    }
}
