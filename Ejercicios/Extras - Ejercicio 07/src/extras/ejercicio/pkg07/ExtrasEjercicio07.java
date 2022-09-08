/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package extras.ejercicio.pkg07;

import java.util.Scanner;

public class ExtrasEjercicio07 {

    public static void main(String[] args) {
       
        float promedio, contador=0, suma=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Pastenaca, ingresá cuántos números le vas a meter");
        N = leer.nextInt();
        int vector[]= new int [n];
        while (N > 0){
            if (N==0){
            break;
            }
             if (valMax < N){
                 
             valMax=N;
             
             }
             if (valMin > N && N!=0){
             valMin=N;
             
             }
            System.out.println("Siga ingresando números. Finalice con cero");
            N=leer.nextInt();
            suma+=N;
            contador++;
        }
        System.out.println("El valor máximo es: " +valMax);
        System.out.println("El valor mínimo es: " +valMin);
        System.out.println("El promedio es: " + suma/(contador-1));
    }
    
}
