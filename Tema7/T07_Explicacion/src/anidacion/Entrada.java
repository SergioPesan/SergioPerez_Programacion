package anidacion;

public class Entrada {

    public static void main(String[] args) {

        //Clase General
        /*ClaseGeneral claseGeneral = new ClaseGeneral("General", 1, false);
        //Clase anidada
        ClaseGeneral.ClaseAnidada claseAnidada = claseGeneral.new ClaseAnidada("Anidada", 2, true);

        claseAnidada.accesoGeneral();
        claseAnidada.mostrarDatosHija();*/


        //Static
        ClaseGenerica claseGenerica = new ClaseGenerica("Nombre", 10, true);
        ClaseGenerica.metodoGenerico();
        ClaseGenerica.ClaseStatic claseStatic = new ClaseGenerica.ClaseStatic("Nombre Static",7, false);


    }
}
