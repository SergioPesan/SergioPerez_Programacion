public class Entrada {
    public static void main(String[] args) {
        System.out.println("SILLA");
        Silla silla = new Silla("Roble",5,100,4);
        silla.calcularPrecio();

        System.out.println(" ");

        System.out.println("FILETE");
        Carne filete = new Carne("Superior","Galicia",100,50);
        filete.calcularPrecio();

        System.out.println("");

        System.out.println("MESA");
        Mesa mesa = new Mesa("Roble",20,300,6);
        mesa.calcularPrecio();

        System.out.println(" ");

        System.out.println("LECHE");
        Lacteo leche = new Lacteo("Premium", "Asturias", 50,100);
        leche.calcularPrecio();

        System.out.println(" ");
        System.out.println(" ");

        Supermercado<Alimento> supermercadoAlimento = new Supermercado<>();
        supermercadoAlimento.anadirGenero(filete);
        supermercadoAlimento.anadirGenero(leche);
        supermercadoAlimento.mostrarPreciosFinales();
        supermercadoAlimento.listarDatos();

        System.out.println("");

        Supermercado<Mueble> supermercadoMueble = new Supermercado<>();
        supermercadoMueble.anadirGenero(silla);
        supermercadoMueble.anadirGenero(mesa);
        supermercadoMueble.mostrarPreciosFinales();
        supermercadoMueble.listarDatos();

        Supermercado<Inventariable> supermercadoGenerico = new Supermercado<>();
        supermercadoGenerico.anadirGenero(silla);
        supermercadoGenerico.anadirGenero(mesa);
        supermercadoGenerico.anadirGenero(filete);
        supermercadoGenerico.anadirGenero(leche);
        supermercadoGenerico.mostrarPreciosFinales();
        supermercadoGenerico.listarDatos();



    }
}
