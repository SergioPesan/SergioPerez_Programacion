package trigonometría;

public class Triangulo extends Figura{
    double base, altura;

    public Triangulo(double base, double altura, double area){
       super(area);
       this.base = base;
       this.altura = altura;
    }

    public void calcularArea(){
        double area = (base * altura) / 2;
    }
}
