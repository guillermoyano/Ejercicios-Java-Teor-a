/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejercicio.pkg13.teoria;

import java.util.Scanner;

public class Ejercicio13Teoria {

    public static void main(String[] args) {
        String[] equipo = new String[9];
        String nombre;
        Scanner leer = new Scanner(System.in); 
       
        for (int i = 0; i < 9; i++){
            System.out.println("Ingrese el nombre para la posición " +(i+1));
            nombre = leer.nextLine();
            equipo[i] = nombre;
        }
        for (int i = 0; i < 9; i++){
           System.out.println("El nombre ingresado en la posición " + (i+1) + " es: " + equipo[i]);
           System.out.println(" ");
        }
       
        }
    } 
    
    

