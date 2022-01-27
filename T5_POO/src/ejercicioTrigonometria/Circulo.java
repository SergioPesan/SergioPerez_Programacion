package ejercicioTrigonometria;

public class Circulo {
    //atributos
    private double radio, diametro, area;

    //contructores
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }

    //Métodos
    public void areaCirculo(){
        this.area = Math.PI * Math.pow(this.radio,2);
    }

    public void diametroCirculo(){
        this.diametro = 2 * this.radio;
    }
}
