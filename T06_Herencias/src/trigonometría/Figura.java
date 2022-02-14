package trigonometría;

public abstract class Figura {
    double area, base, altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Figura(double area){
        this.area = area;
    }

    //Poner solo area, ya que es la comun y es una condicion
}
