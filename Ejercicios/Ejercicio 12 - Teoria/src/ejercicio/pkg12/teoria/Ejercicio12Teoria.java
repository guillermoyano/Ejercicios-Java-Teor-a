/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ejercicio.pkg12.teoria;

import java.util.Scanner;


public class Ejercicio12Teoria {

   
    public static void main(String[] args) {
        int num1, num2;
        
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números. Comprobaremos si son múltiplos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean resultado = EsMultiplo(num1, num2);
        if (resultado==true){
            System.out.println("Los números son múltiplos");
        }else{
            System.out.println("Los números no son múltiplos");
        }
        
    }
     public static boolean EsMultiplo(int num1, int num2){   
        int nummax, nummin;
        boolean multiplo;
        
        if (num1 > num2){
            nummax = num1;
            nummin = num2;
        }else{
            nummax = num2;
            nummin = num1;
        }
        int resto;
        resto = nummax%nummin;
        if (resto == 0){
            multiplo = true;
        }else{
            multiplo = false;
        }
        return multiplo;
     }    
   
    
}
