/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package extras.ejercicios.pkg08;

import java.util.Scanner;

public class ExtrasEjercicios08 {

    public static void main(String[] args) {
        int numero = 0, contador = 0, contador2 = 0, contador3 = 0;
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;

        
            do {
                System.out.println("Anda ingresando números purrete");
                numero = leer.nextInt();
               if (numero%5 == 0){
                   bandera=true;
                   break;
               }
                if (numero%2 == 0 && numero>0) {
                    contador2++;
                } else if (numero%2 == 1 && numero>0) {
                    contador3++;
                }
            } while (bandera=true);
            System.out.println("La cantidad de números pares es: " +contador2);
            System.out.println("La cantidad de números impares es: " +contador3);
            System.out.println("Se ingresaron en total " +(contador2+contador3)+ " numeros");
        }
    }


