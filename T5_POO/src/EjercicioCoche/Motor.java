package EjercicioCoche;

public class Motor {

    //atributos
    private int litrosAceite, cv;

    //constructor
    public Motor(int litrosAceite, int cv){
        this.litrosAceite = litrosAceite;//litros = 0 (this.litrosAceite = 0;)
        this.cv = cv;
    }
    public Motor(int cv){
        this.cv = cv;
    }
    //getter
    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    //setter

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
}
