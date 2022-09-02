/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10./*
*/

package ejercicio.pkg11.teoria;

import java.util.Scanner;


public class Ejercicio11Teoria {

    
    public static void main(String[] args) {
        String frase, frasedos = " ", codificador = " ";
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        
        
        for (int i = 0; i < frase.length() ; i++){
            switch (frase.substring(i)){
                case "A" :
                case "a" :    
                    codificador = concat(codificador, "@");
                    break;
                case "E" :
                case "e" :
                    codificador = concat(frase, "#");
                    break;
                case "I" :
                case "i" :
                    codificador = concat(codificador, "$");
                    break;
                case "O" :
                case "o" :
                    codificador = concat(codificador, "%");
                    break;
                case "U" :
                case "u" :
                    codificador = concat(codificador, "*");
                    break;
                default:
                    codificador = concat(codificador, frase.substring(i));
            }
                    
        }
    }

    private static String concat(String codificador, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
