/*
Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ..

 */
package extras.ejercicio.pkg24;

import java.util.Scanner;

public class ExtrasEjercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, a = 0, b = 1, suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();
        int vector[] = new int[N];
        for (int i = 0; i < vector.length; i++) {
            suma = a + b;
            a = b;
            b = suma;
            vector[i] = suma;
            System.out.print("[" + vector[i] + "]");
    }
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cant de números de fibonacci");
        int n = leer.nextInt();
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 1 || i == 0) {
                fib[i] = 1;
            } else {fib[i]=fib[i-1]+fib[i-2];
            }
            System.out.print("["+fib[i]+"] ");
        }
        */
}
}
