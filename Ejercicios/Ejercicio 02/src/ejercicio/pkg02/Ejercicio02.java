/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicio.pkg02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        
        System.out.println("El nombre ingresado es: " + nombre);
    }
    
}
