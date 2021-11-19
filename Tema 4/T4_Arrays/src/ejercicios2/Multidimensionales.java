package ejercicios2;

public class Multidimensionales {
    public static void main(String[] args) {
        //valores de la matriz 3x3
        int[][] arrayMulti = new int[3][3];

        arrayMulti[0][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[1][2] = 6;

        // valores de la matriz con diferentes columnas en cada fila
        int[][] arrayMultiDiferente = {{1,2,3,4},{1,2,3},{4,5}};

        arrayMultiDiferente[0][0] = 7;
        arrayMultiDiferente[2][1] = 8;
        arrayMultiDiferente[1][2] = 6;

        //matriz con diferentes columnas en cada fila
        for (int i = 0; i < arrayMultiDiferente.length; i++) {
            for (int j = 0; j < arrayMultiDiferente[i].length; j++) {
                System.out.print(arrayMultiDiferente[i][j] + " ");
            }
            System.out.printf("%n");
        }
        System.out.println();

        //matriz 3x3
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print(arrayMulti[i][j] + " ");
            }
            System.out.printf("%n");
        }
    }
}
