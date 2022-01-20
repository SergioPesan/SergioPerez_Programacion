package ejercicioTrigonometria;

public class Cuadrado {
    //atributos
    private int baseCuadrado, alturaCuadrado;
    private  double areaCuad, perimetroCuad;

    //constructores
    public Cuadrado(){

    }
    public Cuadrado(int baseCuad, int alturaCuad){
        this.baseCuadrado = baseCuadrado;
        this.alturaCuadrado = alturaCuadrado;
    }

    //metodos
    public void areaCuadrado(){
        areaCuad = baseCuadrado * alturaCuadrado;
    }
    public void perimetroCuadrado(){
        perimetroCuad = 2 * baseCuadrado + 2 * alturaCuadrado;
    }
}
