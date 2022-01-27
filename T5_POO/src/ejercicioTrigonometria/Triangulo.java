package ejercicioTrigonometria;

public class Triangulo {
    //atributos
    private int base, altura;
    private double area;

    //constructores
    public  Triangulo(){}
    public Triangulo(int base, int altura){
        this.base= base;
        this.altura = altura;
    }

    //método
    public void areaTriangulo(){
        this.area = (base * altura) / 2;
    }
}
