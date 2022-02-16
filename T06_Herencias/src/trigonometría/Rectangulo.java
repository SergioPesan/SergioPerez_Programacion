package trigonometría;

public class Rectangulo extends Figura{
    private double base, altura;

    public Rectangulo(double base, double altura, double area){
        super(area);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        double area = base * altura;
    }

    public void calcularPerimetro(){
        double perimetro = 2*(base + altura);
    }
}
