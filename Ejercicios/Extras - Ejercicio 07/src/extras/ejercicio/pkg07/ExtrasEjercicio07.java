/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package extras.ejercicio.pkg07;

import java.util.Scanner;

public class ExtrasEjercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        opcion1(leer);
        opcion2(leer);
    }

    public static void opcion1(Scanner leer) {
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        int n = leer.nextInt();
        int cont = 0;
        int num = 0, max = 0, min = 0;
        double suma = 0;
        while (cont != n) {
            cont++;
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (cont == 1) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
    
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        System.out.println("El promedio es de " + suma / cont);
    }

public static void opcion2 (Scanner leer){
System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        int n = leer.nextInt();
        int cont = 0;
        int num = 0, max = 0, min = 0;
        double suma = 0;
        do {
         cont++;
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (cont == 1) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
    } while (cont != n);
    System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        System.out.println("El promedio es de " + suma / cont);     
}
}
