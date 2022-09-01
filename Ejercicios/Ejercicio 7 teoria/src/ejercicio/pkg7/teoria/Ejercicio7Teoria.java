/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7.teoria;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Ejercicio7Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número del motor para determinar el tipo");
         TipoMotor = leer.nextInt();
         switch (TipoMotor){
             case 1:
                 System.out.println("La bomba es una bomba de agua.");
                 break;
             case 2:
                 System.out.println("La bomba es una bombda de gasolina");
                 break;
             case 3:
                 System.out.println("La bomba es una bomba de hormigón");
                 break;
             case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
                 break;
             default: System.out.println("No existe un valor válido para tipo de bomba");
         }
    }
    
}
