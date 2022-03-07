public class Jefe extends Trabajador implements Comision{
    private String trabajadores;
    private double voto = 0.33, beneficio = 0.15;

    public Jefe(String nombre, String apellido, String dni, double sueldo, String departamento, String trabajadores, double voto, double beneficio) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.trabajadores = trabajadores;
        this.voto = voto;
        this.beneficio = beneficio;
    }

    @Override
    public void repartirBeneficios() {}

    //Getter & Setter
    public String getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(String trabajadores) {
        this.trabajadores = trabajadores;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
}
