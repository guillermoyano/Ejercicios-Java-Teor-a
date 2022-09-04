/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio.pkg01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números para realizar una suma");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        suma = num1 + num2;
        
        System.out.println("La suma del número " + num1 + " más el número " + num2 + " es igual a " + suma);
    }
    
}
