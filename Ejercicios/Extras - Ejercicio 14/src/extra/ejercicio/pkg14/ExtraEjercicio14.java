/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package extra.ejercicio.pkg14;

import java.util.Scanner;

public class ExtraEjercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double N, M, promedio;
        System.out.println("Ingrese la cantidad de familias");
        N = leer.nextDouble();
        System.out.println("Ingrese la cantidad de hijos de la familia");
        M = leer.nextDouble();
        System.out.println("El promedio de cantidad de hijos por familia es: " +M/N);
    }
    
}
