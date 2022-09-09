/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package extras.ejercicio.pkg01;

import java.util.Scanner;

public class ExtrasEjercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("]Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        
        double horas = minutos/60;
        double dias = horas/24;
        double horas2 = horas - Math.floor(dias)*24;
        
        System.out.println(Math.floor(dias)+" dias "+ horas2 + " horas.");
    }

}

         
