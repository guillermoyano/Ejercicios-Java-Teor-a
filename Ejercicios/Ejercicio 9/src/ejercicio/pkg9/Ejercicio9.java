/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package ejercicio.pkg9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String frase;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra o una frase");
        frase = leer.nextLine();
        corrobora(frase);
    }
        public static boolean corrobora(String frase){
        String primera, letra;
        boolean retorno;
        primera = frase.substring(0,1);
        letra = primera.toUpperCase();
        if (letra.equals("A")){
            retorno = true;
            System.out.println("Correcto");
        }else{
            retorno = false;
            System.out.println("Incorrecto");
        }
        return retorno;
    }
}
    

