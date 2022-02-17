package trigonometría;

public class Rectangulo extends Figura{
    private double base, altura, perimetro;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        this.area = this.base * this.altura;
        return this.area;
    }

    public double calcularPerimetro(){
        this.perimetro = 2*(base + altura);
        return this.perimetro;
    }
}
