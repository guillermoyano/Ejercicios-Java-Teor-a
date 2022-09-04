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
        String frase, aux;
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        resultado(frase);
        System.out.println(resultado(frase));
    }
        public static String resultado(String frase){
        String codificador = " ", res;
        
        int j= frase.length();
          for (int i=0; i< j ;i++){
              
          switch (frase.substring(i, i+1)){
            case "A":
            case "a":
             
               codificador=codificador.concat("@");
              
                    break;
            case "E":
            case "e":
                 codificador=codificador.concat("#");
               
                    break;
            case "I":
            case "i":
                 codificador=codificador.concat("$");
               
                    break;
            case "O":
            case "o":
                 codificador=codificador.concat("$");
               
                    break;
            case "U":
            case "u":
                 codificador=codificador.concat("$");
               
                    break;        
            default :
                codificador = codificador.concat(frase.substring(i,i+1));        
              }
        }
               return codificador;
        } 
}
