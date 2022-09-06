/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        int num, numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();
        int vec[] = new int[num];
        llenarVector(vec, num);
        buscarNumero(vec, num);
    }

    public static void llenarVector(int vec[], int num) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 100000);
            System.out.println("[" +vec[i] + "]");

        }
    }

    public static void buscarNumero(int vec[], int num) {
        int contador1 = 0, contador01 = 0, contador001 = 0, contador0001 = 0, contador00001 = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] <= 9) {
                contador1++;
            }
            if (vec[i] >= 10 && vec[i] <= 999) {
                contador01++;
            }
            if (vec[i] >= 100 && vec[i] <= 9999) {
                contador001++;
            }
            if (vec[i] >= 1000 && vec[i] <= 99999) {
                contador0001++;
            }
            if (vec[i] >= 10000 && vec[i] <= 99999) {
                contador00001++;
            }

        }
        System.out.println("Se encontraron " + contador1 + " números de 1 dígitos");
        System.out.println("Se encontraron " + contador01 + " números de 2 dígitos");
        System.out.println("Se encontraron " + contador001 + " números de 3 dígitos");
        System.out.println("Se encontraron " + contador0001 + " números de 4 dígitos");
        System.out.println("Se encontraron " + contador00001 + " números de 5 dígitos");
        
    }

}
