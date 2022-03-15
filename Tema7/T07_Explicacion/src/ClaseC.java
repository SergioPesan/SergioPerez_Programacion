public class ClaseC {

    public void registrarMensajeElemento(ClaseA clase){
        clase.mostrarMensaje();
        clase.mensajeAbstracto();
    }

    public void modificarMensaje(String s, Modificables modificables){
        modificables.lanzarMayusculas(s);
        modificables.lanzarMinusculas(s);
    }
}
