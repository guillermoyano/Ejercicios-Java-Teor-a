/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package extras.ejercicio.pkg02;

import java.util.Scanner;

public class ExtrasEjercicio02 {

    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 4 números enteros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        
        System.out.println("El número ingresado en A es; " +a);
        System.out.println("El número ingresado en B es; " +b);
        System.out.println("El número ingresado en C es; " +c);
        System.out.println("El número ingresado en D es; " +d);
        
        e=a;
        a=d;
        d=b;
        b=c;
        c=e;
        System.out.println("================================");
        System.out.println("La variable A ahora vale: " +a);
        System.out.println("La variable B ahora vale: " +b);
        System.out.println("La variable C ahora vale: " +c);
        System.out.println("La variable D ahora vale: " +d);
    }
    
}
