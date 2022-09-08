/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package extras.ejercicio.pkg01;

import java.util.Scanner;

public class ExtrasEjercicio01 {

    public static void main(String[] args) {
        int minutos;
        double dias,horas;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir");
        minutos = leer.nextInt();
        
        horas = minutos/60;
        
        dias= Math.round(horas/24);
        if (dias >= 1){
            horas = Math.floor(horas - (24*dias));
        }
        System.out.println(minutos + " minutos convertidos son: "+dias+" dias, y " +horas+ "horas");
    }
    
}
