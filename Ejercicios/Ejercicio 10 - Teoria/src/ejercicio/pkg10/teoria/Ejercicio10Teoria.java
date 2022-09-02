/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
for (int i = 0; i < 10; i++) { //Para i=1 Hasta 4 Con Paso 1 Hacer
 */
package ejercicio.pkg10.teoria;

import java.util.Scanner;


public class Ejercicio10Teoria {

   
    public static void main(String[] args) {
  
        int num1, num2, num3, num4;
            System.out.println("Ingrese 4 números comprendidos entre 1 y 20");
            Scanner leer = new Scanner(System.in);
            
          
              num1 = leer.nextInt();
              num2 = leer.nextInt();
              num3 = leer.nextInt();
              num4 = leer.nextInt();  
          
           while (num1 < 1 || num1 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num1 = leer.nextInt();
           }
            while (num2 < 1 || num2 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num2 = leer.nextInt();
           }
             while (num3 < 1 || num3 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num3 = leer.nextInt();
           }
              while (num4 < 1 || num4 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num4 = leer.nextInt();
           }
                System.out.print( num1 + " ");
                for (int j=0; j < num1; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");
            
             
                System.out.print( num2 + " ");
                for (int j=0; j < num2; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");
            
             
                System.out.print(num3 + " ");
                for (int j=0; j < num3; j++){
                    System.out.print("*");
                }
                 System.out.println(" ");
            
            
                System.out.print(num4 + " ");
                for (int j=0; j < num4; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");
                 
        
    } 
     
}
