public class Entrada {

    /*ambito de clase
    String nombre = "Sergio";*/

    public static void main(String[] args) {
        /*ambito de método - local
        String nombre = "Sergio";*/

        Usuario usuario1 = new Usuario();
        //correoElectronico=null, nombre=null, apellido=null, password=null, fecha=null, edad=0

        Usuario usuario2 = new Usuario();
        //correoElectronico=null, nombre=null, apellido=null, password=null, fecha=null, edad=0

        Usuario usuario3 = new Usuario("Sergio", "sergio.perez@ces.es","pass");
        //correoElectronico="sergio.perez@ces.es", nombre="Sergio", apellido=null, password="pass", fecha=null, edad=0

        Usuario usuario4 = new Usuario("sergio.perez@ces.es","pass", 18);
        //correoElectronico="sergio.perez@ces.es", nombre=null, apellido=null, password=pass, fecha=null, edad=18

        //usuario1.password = "contraseña"; //he cambiado el valor password del usuario1

        usuario1.setPassword("Contraseña");
        //System.out.println(usuario1.getPassword());

        //usuario1.mostrarDatos();
        System.out.println(usuario1.mostrarDatosRetorno());

        usuario1.saludar("Sergio");
        usuario1.saludar("Luis");

        usuario1.saludar(usuario4);
        usuario2.saludar(usuario3);



    }
}
