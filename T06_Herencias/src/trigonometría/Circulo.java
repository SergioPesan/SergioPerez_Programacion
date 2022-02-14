package trigonometría;

public class Circulo extends Figura {
    private double radio;

    public Circulo(){}
    public Circulo(double radio){
        this.radio = radio;
    }

    //metodos
    public void calcularArea(){
        double area = (Math.PI) * (Math.pow(radio,2));
    }
    public void calcularDiametro(){
        double diametro = 2 * radio;
    }
}
