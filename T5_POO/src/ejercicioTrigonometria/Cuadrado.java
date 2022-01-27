package ejercicioTrigonometria;

public class Cuadrado {
    //atributos
    private int base, altura;
    private  double area, perimetro;

    //constructores
    public Cuadrado(){

    }
    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public void areaCuadrado(){
        this.area = this.base * this.altura;
    }
    public void perimetroCuadrado(){
        this.perimetro = 2 * this.base + 2 * this.altura;
    }
}
