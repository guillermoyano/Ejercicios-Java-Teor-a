/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package extras.ejercicio.pkg06;

import java.util.Scanner;

public class ExtrasEjercicio06 {

    public static void main(String[] args) {
        float altura, suma1=0, suma2=0;
        int personajes, contador=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personajes");
        personajes = leer.nextInt();
        System.out.println("Ingrese la altura de los personajes");
        
        for (int i = 0; i < personajes; i++) {
            altura = leer.nextFloat();
            if (altura < 1.6){
                contador++;
                suma1 = suma1 + altura;   
            }
            suma2 = suma2 + altura;
        }
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " +suma1/contador+ " mts");
        System.out.println("El promedio general estaturas es: " +(suma2)/personajes+" mts");
    }
    
}
