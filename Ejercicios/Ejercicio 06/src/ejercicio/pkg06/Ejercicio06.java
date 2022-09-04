/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio.pkg06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        boolean resultado = parImpar(num);
        if (resultado==true){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        
    }
    
    public static boolean parImpar(int num){
        int resto;
        boolean division;
        resto = num%2;
        if (resto == 0){
            division = true;
        }else{
            division = false;
        }
        return division;
    }
    
}
