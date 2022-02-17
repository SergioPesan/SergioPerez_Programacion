package trigonometría;

public class Circulo extends Figura {
    private double radio, diametro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(){}


    @Override
    public double calcularArea() {
        this.area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularDiametro(){
         this.diametro =this.radio * 2;
         return this.diametro;
    }
}
