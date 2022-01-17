package EjercicioCoche;

public class Coche {

    //variables
    private Motor motor;
    private String marca, modelo;
    private double costeAveria;

    //constructor
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acumularAveria(double costeAveria){
        this.costeAveria += costeAveria;
    }

    //getter

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosteAveria() {
        return costeAveria;
    }

    public Motor getMotor() {
        return motor;
    }
}
