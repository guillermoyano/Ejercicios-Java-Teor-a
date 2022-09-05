/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ejercicio.pkg08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        String palabra;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 letras (ni una más, ni una menos)");
        palabra = leer.nextLine();
        ingreso(palabra);
    }
        public static boolean ingreso(String palabra){
        int largo;
        largo = palabra.length();
        boolean retorno;
        if (largo == 8){
            retorno = true;
            System.out.println("Corrrrrecccctoooo!!!");
            
        }else{
            System.out.println("Incorrecto");
            retorno = false;
        }
        return retorno;
    }
    
}
    

