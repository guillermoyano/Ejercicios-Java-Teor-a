/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:

Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package ejercicio.pkg21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int[][] matrizGrande = new int[10][10];
        int[][] matrizChica = new int[3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j] = (int) (Math.random() * 10);
            }
        }
        mostrarMatrizGrande(matrizGrande);
        System.out.println("Ingrese la matriz Reducida");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "," + j + "]");
                matrizChica[i][j] = leer.nextInt();
            }
        }
        encontrarMatrizPequeña(matrizGrande, matrizChica);
    }

    public static void mostrarMatrizGrande(int[][] matrizGrande) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void encontrarMatrizPequeña(int[][] matrizGrande, int[][] matrizChica) {
        boolean hizoMach = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizGrande[i][j] == matrizChica[0][0] && i < 8 && j < 8) {
                    if (matrizGrande[i][j] == matrizChica[0][0] && matrizGrande[i][j + 1] == matrizChica[0][1] && matrizGrande[i][j + 2] == matrizChica[0][2]) {
                        if (matrizGrande[i + 1][j] == matrizChica[1][0] && matrizGrande[i + 1][j + 1] == matrizChica[1][1] && matrizGrande[i + 1][j + 2] == matrizChica[1][2]) {
                            if (matrizGrande[i + 2][j] == matrizChica[2][0] && matrizGrande[i + 2][j + 1] == matrizChica[2][1] && matrizGrande[i + 2][j + 2] == matrizChica[2][2]) {
                                System.out.println("Se encontro una simetria");
                                System.out.println("La matriz pequeña se encontró en las coordenadas: ");
                                for (int k = i; k < i + 3; k++) {
                                    for (int l = j; l < j + 3; l++) {
                                        System.out.print("[" + k + "," + l + "] ");
                                    }
                                    System.out.println("");
                                }
                                hizoMach = true;
                            }
                        }
                    }
                }
                if (hizoMach == true) {
                    break;
                }
            }
            if (hizoMach == true) {
                break;
            }
        }
        if (hizoMach == false) {
            System.out.println("No se encontro la Matriz Pequeña");
        }
    }

}
    
    

