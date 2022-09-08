/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicio.pkg20;

public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        mostrarMatriz(matriz);
        compararMatriz(matriz);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("==================");
    }

    public static void compararMatriz(int matriz[][]) {
        boolean magica = false;
        int sumaDiag1 = 0, sumaDiag2 = 0, sumaFila = 0, sumaColumna = 0;
        int[] sumaCo = new int[3];
        int[] sumaFi = new int[3];

        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es " + sumaFila);
            System.out.println("");
            sumaFi[i] = sumaFila;
        }
        for (int j = 0; j < 3; j++) {
            sumaColumna = 0;
            {
                for (int i = 0; i < 3; i++) {
                    sumaColumna = sumaColumna + matriz[i][j];
                }
                System.out.println("La suma de la columna " + (j + 1) + " es " + sumaColumna);
            }
            System.out.println("");
            sumaCo[j] = sumaColumna;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiag1 = sumaDiag1 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal principal es: " + sumaDiag1);
        System.out.println("");
        System.out.println("La suma de la diagonal invertida es: " + sumaDiag2);
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if ((sumaCo[i] == sumaFi[i]) && (sumaDiag1 == sumaDiag2) && (sumaCo[i] == sumaDiag1)) {
                magica = true;
            } else {
                magica = false;
                break;
            }
        }
        if (magica == true) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");

        }
    }
}
