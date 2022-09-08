/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package extras.ejercicio.pkg04;

import java.util.Scanner;

public class ExtrasEjercicio04 {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número (entre el 1 y el 10), y lo convertiremos en romano");
        numero = leer.nextInt();
        convertir(numero);
    }
    
    public static void convertir(int numero){
        switch (numero){
            case 1:
                System.out.println("El número " +numero+ " convertido a número romano es I");
                break;
            case 2:
                System.out.println("El número " +numero+ " convertido a número romano es II");
                break;
            case 3:
                System.out.println("El número " +numero+ " convertido a número romano es III");
                break;
            case 4:
                System.out.println("El número " +numero+ " convertido a número romano es IV");
                break;
            case 5:
                System.out.println("El número " +numero+ " convertido a número romano es V");
                break;
            case 6:
                System.out.println("El número " +numero+ " convertido a número romano es VI");
                break;
            case 7:
                System.out.println("El número " +numero+ " convertido a número romano es VII");
                break;
            case 8:
                System.out.println("El número " +numero+ " convertido a número romano es VIII");
                break;
            case 9:
                System.out.println("El número " +numero+ " convertido a número romano es IX");
                break;
            case 10:
                System.out.println("El número " +numero+ " convertido a número romano es x");
                break;
            default:
                System.out.println("Te dijimos entre 1 y 10!!!!!!");
        }
    }
    
     
}
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
    public static void convertir(int numero) {
        do {
            switch (numero) {
                case 1:
                    System.out.println("El numero " + numero + " convertido a Romano es I");
                    break;
                case 2:
                    System.out.println("El numero " + numero + " convertido a Romano es II");
                    break;
                case 3:
                    System.out.println("El numero " + numero + " convertido a Romano es III");
                    break;
                case 4:
                    System.out.println("El numero " + numero + " convertido a Romano es IV");
                    break;
                case 5:
                    System.out.println("El numero " + numero + " convertido a Romano es V");
                    break;
                case 6:
                    System.out.println("El numero " + numero + " convertido a Romano es VI");
                    break;
                case 7:
                    System.out.println("El numero " + numero + " convertido a Romano es VII");
                    break;
                case 8:
                    System.out.println("El numero " + numero + " convertido a Romano es VIII");
                    break;
                case 9:
                    System.out.println("El numero " + numero + " convertido a Romano es IX");
                    break;
                case 10:
                    System.out.println("El numero " + numero + " convertido a Romano es X");
                    break;
                default:
                    System.out.println("No dije entre 1 y 10??? Hay que ser!!");
                    break;
            }
        } while (numero < 1 && numero > 10);
*/

  