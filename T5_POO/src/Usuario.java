public class Usuario {

    //Variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;

    //Constructores
        //si no hay constructores escritos, hay un constructor que es el vacío (por defecto)
        //este constructor deja de existir cuando se escribe algun constructor

    public Usuario(){
        nombre = "Por defecto";
        correoElectronico = "Por defecto";
        edad = 18;
    }

    public Usuario(String nombre, String correoElectronico, String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public  Usuario(String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }

    //Métodos

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("Password: " + password);
        System.out.println("Fecha: " + fecha);
        System.out.println("Edad: " + edad);
    }
    
    public String mostrarDatosRetorno(){
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellidos;
    }

    public void saludar(String nombreSaludar){
        System.out.println("Hola " + nombreSaludar + " que tal estas");
    }

    public void saludar(Usuario usuario){
        System.out.println("Hola soy "+ nombre+ " y voy a saludar a " + usuario.getNombre());
    }


    //Métodos especiales getters y setters
    //getter
    public String getPassword(){
        return password;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getNombre() { return nombre; }
    public String getApellidos() {
        return apellidos;
    }
    public String getFecha() {
        return fecha;
    }
    public int getEdad() {
        return edad;
    }

    //setter
    public void setPassword(String password){
        this.password = password;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public void setNombre(String nombre){
        this.correoElectronico = correoElectronico;
    }
    public  void  setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

