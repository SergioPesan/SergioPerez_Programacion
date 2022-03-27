public final class Dialecto extends Idioma {

    private Idioma idioma;
    private int numHablantes;

    public Dialecto(String nombre, int numeroHablantes, Idioma idioma, int numHablantes) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
        this.numHablantes = numHablantes;
    }

    @Override
    public void saludar() {
        System.out.println("Este es el saludo catalán");
    }

    @Override
    public void despedir() {
        System.out.println("Esta es la despedida en catalán");
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public int getNumHablantes() {
        return numHablantes;
    }

    public void setNumHablantes(int numHablantes) {
        this.numHablantes = numHablantes;
    }

    public void calcularNumHablantes(int numHablantes, Cuantificable c){
        c.cuantificarHablantes();
    }
}
