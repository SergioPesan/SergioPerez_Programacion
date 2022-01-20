package ejercicioTrigonometria;

public class Triangulo {
    //atributos
    private int baseTriangulo, alturaTriangulo;


    //constructores
    public  Triangulo(){

    }
    public Triangulo(int base, int altura){
        this.baseTriangulo = base;
        this.alturaTriangulo = altura;
    }

    //método
    public void areaTriangulo(double areaTriangulo){
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
    }
}
