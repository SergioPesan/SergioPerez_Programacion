public enum Equipo {

    // 1. construidos
    Barcelona("FC. Barcelona",20000),
    Madrid("Real Madrid",10000),
    Atletico("Atlético de Madrid",30000),
    Sevilla,
    Getafe,
    Alcorcon;

    // 2. variables
    String nombre;
    int presupuesto;

    // 3. constructores

    Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }
    Equipo(){}


    // 4. métodos

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Presupuesto: " + presupuesto);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
