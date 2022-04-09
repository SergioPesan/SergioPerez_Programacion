public class Cuenta {

    // atributos
    private int id,pin;
    private double saldo;

    // constructor
    public Cuenta() {
    }

    public Cuenta(int id, int pin, double saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    // métodos
    public void ingresarDinero(){

    }

    public void sacarDinero(){

    }

    //getters y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
