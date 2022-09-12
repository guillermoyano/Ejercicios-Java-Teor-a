/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)
 */
package extras.ejercicio.pkg19;

import java.util.Scanner;

public class ExtrasEjercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Qué tan grande lo querés?");
        n = leer.nextInt();
        int vectorA[] = new int[n];
        int vectorB[] = new int[n];
        llenarVectorA(vectorA, n, leer);
        llenarVectorB(vectorB, n, leer);
        comparaVector(vectorA, vectorB, n);
    }

    public static void llenarVectorA(int vectorA[], int n, Scanner leer) {
        for (int i = 0; i < n; i++) {
            System.out.println("A llenar el vector A. Metele un número");
            vectorA[i] = leer.nextInt();
        }
        System.out.println("==============");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorA[i] + "]");

        }
        System.out.println("");
        System.out.println("---------------");
    }

    public static void llenarVectorB(int vectorB[], int n, Scanner leer) {
        System.out.println("Ahora llenaremos el otro vector");

        for (int i = 0; i < n; i++) {
            System.out.println("A llenar el vector B. Metele un número");
            vectorB[i] = leer.nextInt();
        }

        System.out.println("==============");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("");
    }

    public static void comparaVector(int vectorB[], int vectorA[], int n) {
        for (int i = 0; i < n; i++) {
                if (vectorA[i] != vectorB[i]) {
                    System.out.println("Los vectores NO son iguales");
                    break;
                }
        }
    }

}
