package genericos;

public class Entrada {
    public static void main(String[] args) {
        Coleccion<Disco> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());

        Coleccion<Camiseta> coleccionCamisetas = new Coleccion();
        coleccionCamisetas.agregarCosas(new Camiseta());

        Coleccion<Partido> coleccionPartidos = new Coleccion();
        coleccionPartidos.agregarCosas(new Partido());

        Coleccion<Coche> coleccionCoches = new Coleccion();
        coleccionCoches.agregarCosas(new Coche());

        Coleccion<Coleccionable> coleccionColeccionables = new Coleccion();
        coleccionColeccionables.agregarCosas(new Disco());
        coleccionColeccionables.agregarCosas(new Camiseta());

        Coleccion<Integer> coleccionNumeros = new Coleccion<>();

        ColeccionEspecifica<Disco> listaEspecifica1 = new ColeccionEspecifica<Disco>();
        ColeccionEspecifica<Camiseta> listaEspecifica2 = new ColeccionEspecifica<Camiseta>();





    }
}
