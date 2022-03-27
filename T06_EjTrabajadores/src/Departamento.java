public enum Departamento {

    Ventas("Ventas",10),
    Finanzas("Finanzas",15),
    IT("IT",3),
    Comercial("Comercial",7);

    String nombre;
    int numTrabajadores;

    Departamento(String nombre, int numTrabajadores) {
        this.nombre = nombre;
        this.numTrabajadores = numTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
}
