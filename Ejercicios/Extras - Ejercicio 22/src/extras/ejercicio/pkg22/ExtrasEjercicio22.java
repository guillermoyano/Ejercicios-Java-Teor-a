/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 */
package extras.ejercicio.pkg22;

import java.util.Scanner;

public class ExtrasEjercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N, M;
        System.out.println("Ingrese el alto de la matriz");
        N = leer.nextInt();
        System.out.println("Ingrese el ancho de la matriz");
        M = leer.nextInt();
        int matriz [][] = new int [N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" +matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
    }
    
}
