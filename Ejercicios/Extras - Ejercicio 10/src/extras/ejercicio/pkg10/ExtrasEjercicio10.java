/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package extras.ejercicio.pkg10;

import java.util.Scanner;

public class ExtrasEjercicio10 {

    public static void main(String[] args) {
        int respuesta, resultado=0;
        Scanner leer = new Scanner(System.in);
        int numero1 =(int) (Math.random()*10)+1;
        int numero2 =(int) (Math.random()*10)+1;
        
        do{
            System.out.println("- A qué no lo adivinas????");
            System.out.println("- Qué cosa???");
            resultado = numero1*numero2;
            System.out.println("Cuánto es " +numero1+ " por " +numero2+ " ?");
            
            respuesta = leer.nextInt();
            
            
        }while(respuesta!=resultado);
        System.out.println("Me cagaste. El resultado es: " +resultado);
    }
    
}
