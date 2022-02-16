package trigonometría;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double area){
        super(area);
    }
    //metodos

    public void calcularArea(){
        area= (Math.PI) * (Math.pow(radio,2));
    }
    public void calcularDiametro(){
        double diametro = 2 * radio;
    }
}
