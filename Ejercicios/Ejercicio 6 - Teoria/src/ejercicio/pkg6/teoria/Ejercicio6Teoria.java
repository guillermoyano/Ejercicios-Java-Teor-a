/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.teoria;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Ejercicio6Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números para comparar");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        
        if (numero1 > 25 && numero2 > 25){
        System.out.println("Ambos números son mayores a 25");
    }
     else if (numero1 > 25){
            System.out.println("El número " + numero1 + " es mayor a 25");
     }
     else if (numero2 > 25){
            System.out.println("El número " + numero2 + " es mayor a 25");
     }    
     else {
            System.out.println("Ninguno de los 2 números es mayor a 25");
     }
        
    }}
