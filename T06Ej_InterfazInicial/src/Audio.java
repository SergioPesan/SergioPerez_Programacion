public class Audio extends Elemento implements Ejecutable{

    private int duracion;
    private String soporte;

    public Audio(){}
    public Audio(String id, int tamaño, String titulo, String autor, String formato, int duracion, String soporte) {
        super(id, titulo, autor, formato, tamaño);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    //Getter y Setter
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    //Métodos implementados de la interfaz
    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
