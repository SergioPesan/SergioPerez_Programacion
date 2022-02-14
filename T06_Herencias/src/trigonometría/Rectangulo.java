package trigonometría;

public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura){
        super(base, altura);
    }

    public void calcularArea(){
        double area = base * altura;
    }

    public void calcularPerimetro(){
        double perimetro = 2*(base + altura);
    }
}
