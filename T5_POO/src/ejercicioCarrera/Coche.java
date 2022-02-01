package ejercicioCarrera;

public class Coche {
    //atributos
    int caballos, velocidad;
    String matricula, modelo;
    double kmRecorridos;

    //contructores
    public Coche(){
        caballos = 0;
        velocidad = 0;
        matricula = "0000AAA";
        modelo = "Sin especificar";
        kmRecorridos = 0.0;
    }

    public Coche(String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        caballos = cv;
    }

    //métodos
    public void acelerar(int incremento){
        velocidad += incremento;
        kmRecorridos = velocidad * (caballos * (Math.random()*11));

        if (velocidad > 180){
            velocidad = 180;
            System.out.println("Ha llegado a 180 km/h");
        }
    }

    public void frenar(int decremento){
        velocidad -= decremento;

        if (velocidad < 0){
            velocidad = 0;
            System.out.println("El coche se ha detenido");
        }
    }

    public void cocheParado(){
        velocidad = 0;
    }

    public void reseteo(){
        velocidad = 0;
        kmRecorridos =0;
    }

    public void mostrarDatos(){
        System.out.println("Matrícula" + matricula);
        System.out.println("Modelo" + modelo);
        System.out.println("Caballos" + caballos);
        System.out.println("Velocidad" + velocidad);
        System.out.println("Kilómetros" + kmRecorridos);
    }

    //getters

    public int getCaballos() {
        return caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    //setters
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
