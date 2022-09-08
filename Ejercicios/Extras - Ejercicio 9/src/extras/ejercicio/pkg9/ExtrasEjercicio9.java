/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package extras.ejercicio.pkg9;

import java.util.Scanner;

public class ExtrasEjercicio9 {

    public static void main(String[] args) {
        int dividendo, divisor, residuo=0, cociente=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números. Haremos división con restas sucesivas");
        dividendo = leer.nextInt();
        divisor = leer.nextInt();
        
        while (divisor > dividendo){
            System.out.println("El divisor es más grande que el dividendo. NO SE PUEDE!. Poné un número menor");
            divisor = leer.nextInt();            
        }
        do{
            residuo = dividendo-divisor;
            dividendo = residuo;
            cociente = cociente + 1;
        }while (residuo>=divisor);
        System.out.println("El residuo es: " +dividendo+ " y el cociente es: " +cociente);
    }
    
}
