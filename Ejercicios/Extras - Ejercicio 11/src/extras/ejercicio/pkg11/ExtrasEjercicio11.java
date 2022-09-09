/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package extras.ejercicio.pkg11;

import java.util.Scanner;

public class ExtrasEjercicio11 {

    public static void main(String[] args) {
        int numero, auxiliar = 1, contador = 0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número de 5 cifras o más");
        numero = leer.nextInt();
        contar(numero, auxiliar, contador);
    }
        public static void contar(int numero, int auxiliar, int contador){
        while ( numero >= 1) {
            auxiliar = (numero/10);
            numero = auxiliar;
            contador++;
                    
        }
        
        System.out.println("La cantida de dígitos ingresados es: " +contador);
        }
    }
    

