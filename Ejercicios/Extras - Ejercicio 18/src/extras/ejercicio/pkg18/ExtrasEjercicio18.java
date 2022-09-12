/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
 */
package extras.ejercicio.pkg18;

import java.util.Scanner;

public class ExtrasEjercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n, suma=0;
        System.out.println("Escribir el tamaño del vector. Vamos a sumar");
        n = leer.nextInt();
        int vector[]= new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Poné un número para sumar");
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma de todos los número es: " +suma);
    }
    
}
