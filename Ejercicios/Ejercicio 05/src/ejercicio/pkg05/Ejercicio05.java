/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicio.pkg05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
       double num, doblete, triplete, raiz;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        doblete = num*2;
        System.out.println("El doble del número " + num + " es: " + doblete);
        
        triplete = num*3;
        System.out.println("El triple del número " + num + " es: " + triplete);
        
        raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada del número " + num + " es: " + raiz);
    }
    
}
