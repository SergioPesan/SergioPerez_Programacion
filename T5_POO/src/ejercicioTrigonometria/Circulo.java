package ejercicioTrigonometria;

public class Circulo {
    //atributos
    private double radio, diametro, areaCirculo;

    //contructores
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }

    //Métodos
    public void areaCirculo(){
        areaCirculo = Math.pow(Math.PI * radio,2);
    }

    public void diametroCirculo(){
        diametro = 2 * radio;
    }
}
