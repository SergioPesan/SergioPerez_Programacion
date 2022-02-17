package trigonometría;

public class Triangulo extends Figura{
    private double base, altura;

    public Triangulo(double base, double altura){
       this.base = base;
       this.altura = altura;
    }

    @Override
    public double calcularArea(){
        this.area = (this.base * this.altura) / 2;
        return area;
    }
}
