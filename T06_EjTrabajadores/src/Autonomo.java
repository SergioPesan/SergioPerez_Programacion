public class Autonomo extends Trabajador{
    private double cuota;
    private String factura;

    public Autonomo(String nombre, String apellido, String dni, double sueldo, String departamento, double cuota, String factura) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        this.factura = factura;
    }

    //Getter & Setter
    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
