/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio.pkg03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        String frase, cadena, cadena2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        cadena = frase.toUpperCase();
        
        System.out.println("La frase en mayúsculas es: " + cadena);
        
        cadena2 = cadena.toLowerCase();
        
        System.out.println("La frase en minúscula es: " + cadena2);
    }
    
}
