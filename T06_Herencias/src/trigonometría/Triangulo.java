package trigonometría;

public class Triangulo extends Figura{

    public Triangulo(double base, double altura){
       super(base, altura);
    }

    public void calcularArea(){
        double area = (base * altura) / 2;
    }
}
