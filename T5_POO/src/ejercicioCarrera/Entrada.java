package ejercicioCarrera;

public class Entrada {
    public static void main(String[] args) {
        //Creacion de coches
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Nissan GT-R", "123B", 480);

        //Mostrar los datos de cada coche
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        //Modificar los datos de cocheA, que estaban por defecto
        cocheA.setModelo("Fiat Multipla");
        cocheA.setMatricula("456A");
        cocheA.setCaballos(116);

        //Modificacion de velocidad de los coches por numeros aleatorios
        cocheA.setVelocidad((int) (Math.random()* (21 - 10) + 10));

        cocheB.setVelocidad((int) (Math.random()* (21 - 10) + 10));
        //Mostrar los datos de cada coche
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();


    }
}