public class Entrada {
    public static void main(String[] args) {
        //Ejemplo ejemplo = new Ejemplo();
        //ejemplo.mostrarConjunto


       Persona persona = new Jugador("Sergio", "Pérez", 123, Posiciones.medio.getDefinicion());
       //valor de mercado = 2000

       Posiciones.medio.setValor(4000);
       //cambia el valor de mercado a 4000 asi que "valor de mercado = 4000"

        Persona persona1 = new Jugador("Sergio1", "Pérez1", 123, Posiciones.medio.getDefinicion());
        //valor de mercado = 4000

        Persona persona2 = new Jugador("Entrenador", "Apellido", 1000,Vocaciones.defensivo.name() );
        Persona persona3 = new Jugador("Entrenador", "Apellido", 1000,Vocaciones.defensivo.name() );

    }
}
