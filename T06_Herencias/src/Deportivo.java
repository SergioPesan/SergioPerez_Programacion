import java.sql.SQLOutput;

public class Deportivo extends Coche{

    private int par;

    // todo lo que tiene coche al poner extends Coche

    public Deportivo(){}

    public Deportivo (String matricula, String bastidor, int cv, int cc, int par){
        super(matricula,bastidor,cv,cc);
        this.par = par;
    }

    // calcular velocidad
        //lo que hacia
        //DEPORTIVO --> 30 - 40
        //ELECTRICO --> 20 - 30
        //SUV -- 10 - 20

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad + (int)(Math.random()* 11)+30);
    }

    public int getPar() {return par;}

    public void setPar(int par) {this.par = par;}


    public void mostrarDatosDeportivo(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Bastidor: " + bastidor);
        System.out.println("CV: " + cv);
        System.out.println("CC" + cc);
        System.out.println("Par" + par);
    }
}
