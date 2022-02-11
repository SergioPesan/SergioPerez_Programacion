public class Utilitario extends Coche{
    private int plazas;

    public Utilitario(String matricula, String bastidor, int cv, int cc, int plazas){
        super(matricula,bastidor,cv,cc);
        this.plazas = plazas;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void mostrarDatosUtilitario(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Bastidor: " + bastidor);
        System.out.println("CV: " + cv);
        System.out.println("CC" + cc);
    }

}
