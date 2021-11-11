public class Arrays {
    public static void main(String[] args) {

        int[] numerosUno = new int[10]; // numerosUno = [0,0,0,0,0,0,0,0,0,0]
        int[] numerosDos = new int[] {1,2,3,4,5,6,7,8,9,10};

        boolean[] aciertos = new boolean[5]; //aciertos = [false, false, false, false, false]
        String[] palabras = new String[3]; //palabras = [null, null, null]

        double[] decimales = new double[2]; // decimales = [0.0, 0.0]

        int longitudArray = numerosDos.length;
        //System.out.println(longitudArray);

        //System.out.println(numerosDos[9]);

        for (int i = 0; i <= numerosDos.length -1; i++) {
            System.out.println(numerosDos[i]);
        }
    }
}
/* De los arrays nos puede interesar:
    Saber cuantas posiciones hay -> .length
    Saber el valor de una posición -> sout-variable[posición]
    Cómo doy valor a posiciones
    Cómo saco todos los valores
 */
