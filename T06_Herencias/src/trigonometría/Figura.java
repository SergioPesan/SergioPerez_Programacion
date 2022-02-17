package trigonometría;

public abstract class Figura {
    protected double area;

    public Figura(){}


    public abstract double calcularArea();
    //Poner solo area, ya que es la comun y es una condicion


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
