/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio.pkg04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        int grados, F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados, en centígrados, para convertirlos en Fahrenheit");
        grados = leer.nextInt();
        
        F = 32 + (9 * grados / 5);
        
        System.out.println(grados + "°, convertidos a Fahrenheit son: " + F + "°F");
                
        
    }
    
}
