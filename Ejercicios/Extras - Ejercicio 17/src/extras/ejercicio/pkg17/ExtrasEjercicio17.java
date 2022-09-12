/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false
 */
package extras.ejercicio.pkg17;

import java.util.Scanner;

public class ExtrasEjercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingresate un numerillo, y veremos si es primillo");
        numero = leer.nextInt();

        System.out.println("El número es primo?: " +esPrimo(numero));
        
    }

    public static boolean esPrimo(int numero) {
        boolean primo = false;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            primo = true;
        } else {
            primo = false;
        }
        return primo;
    }
}
