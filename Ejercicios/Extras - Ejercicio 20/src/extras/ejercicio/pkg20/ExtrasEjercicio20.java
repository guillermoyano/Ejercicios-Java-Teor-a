/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package extras.ejercicio.pkg20;

import java.util.Scanner;

public class ExtrasEjercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int vector[] = new int [10];
        llenarVector(vector);
        mostrarVector(vector);
    }
    
       public static void llenarVector( int vector[]){
           for (int i = 0; i < 10; i++) {
               vector [i] = (int) (Math.random()*100);
           }
    }
       
        public static void mostrarVector(int vector[]){
            for (int i = 0; i < 10; i++) {
               System.out.print("[" + vector[i] +"]"); 
            }  
    }
    
}
