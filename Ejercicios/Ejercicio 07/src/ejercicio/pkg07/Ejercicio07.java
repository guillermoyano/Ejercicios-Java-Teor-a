/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
equals(String str): Sirve para comparar si dos cadenas son
iguales. Devuelve true si son iguales y false
si no.
 */
package ejercicio.pkg07;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        String clave;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clave correcta");
        clave = leer.nextLine();
        ingreso(clave);
    }
    
        public static boolean ingreso(String clave){
        String correcta = "eureka";
        boolean retorno;
        if (clave.equals(correcta)){
            retorno = true;
            System.out.println("Corrrrrecccctoooo!!!");
            
        }else{
            System.out.println("La clave es incorrecta");
            retorno = false;
            
        }
        return retorno;
    }
    
}