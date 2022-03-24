package anidacion;

public class ClaseGenerica {
    private static String nombre;
    private static int numero;
    private static boolean acierto;
    private static ClaseStatic claseStatic;

    public ClaseGenerica(String nombre, int numero, boolean acierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
    }

    public static void metodoGenerico(){
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(acierto);
        claseStatic.metodoClaseStatic();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    static class ClaseStatic{
        private String nombreStatic;
        private int numeroStatic;
        private boolean aciertoStatic;

        public ClaseStatic(String nombreStatic, int numeroStatic, boolean aciertoStatic) {
            this.nombreStatic = nombreStatic;
            this.numeroStatic = numeroStatic;
            this.aciertoStatic = aciertoStatic;
        }

        public void metodoClaseStatic(){
            System.out.println(nombreStatic);
            System.out.println(numeroStatic);
            System.out.println(aciertoStatic);
            metodoGenerico();
        }

        public String getNombreStatic() {
            return nombreStatic;
        }

        public void setNombreStatic(String nombreStatic) {
            this.nombreStatic = nombreStatic;
        }

        public int getNumeroStatic() {
            return numeroStatic;
        }

        public void setNumeroStatic(int numeroStatic) {
            this.numeroStatic = numeroStatic;
        }

        public boolean isAciertoStatic() {
            return aciertoStatic;
        }

        public void setAciertoStatic(boolean aciertoStatic) {
            this.aciertoStatic = aciertoStatic;
        }
    }
}
