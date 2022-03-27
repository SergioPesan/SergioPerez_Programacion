public class Jefe extends Trabajador implements Comision{
    private int numTrabajadores;

    public Jefe(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numTrabajadores, double voto, double beneficio) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numTrabajadores = numTrabajadores;
    }


    @Override
    public double votar() {
        double voto =(int)(Math.random()*11)/2;
        return voto;
    }

    //Getter & Setter


    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trabajadores " + numTrabajadores);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }
    @Override
    public void obtenerBeneficios(/*int beneficio*/) {
        //this.sueldo += (beneficio*0.10);
    }
}
