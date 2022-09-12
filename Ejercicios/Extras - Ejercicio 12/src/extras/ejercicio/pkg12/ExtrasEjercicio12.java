/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package extras.ejercicio.pkg12;

import java.util.Scanner;

public class ExtrasEjercicio12 {

    public static void main(String[] args) {
        //Scanner leer = new Scanner (System.in);
        String [] vector = {"0","1","2","E","4","5","6","7","8","9"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println("" +vector[i]+ "-" +vector[j]+ "-" +vector[k]+ "");                    
                }
            }
        }
        
    }
    
}
