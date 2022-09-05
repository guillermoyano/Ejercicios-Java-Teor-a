/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite para la suma");
        num = leer.nextInt();

        int nro, suma = 0;
        do {
            if (suma > num) {
                System.out.println("Los números ingresados superaron el valor límite");
                break;
            } else {
                System.out.println("Ingrese números para ir sumando");
                nro = leer.nextInt();
                suma = suma + nro;
            }
        }while (suma <= num);

            System.out.println("La suma de los números es: " + suma + " y se pasó del límite");

        }
        
    
    
    }

