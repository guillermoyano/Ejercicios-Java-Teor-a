/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package extras.ejercicio.pkg16;

import java.util.Scanner;

public class ExtrasEjercicio16 {

    public static void main(String[] args) {
        
        String nombre="";
        funcion(nombre);
    }
        public static void funcion(String nombre){
        Scanner leer = new Scanner (System.in);
        String respuesta="";
        int edad;
        do{
            System.out.println("Igrese el nombre de la persona.");
            nombre = leer.next();
            nombre=nombre.toUpperCase();
            
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
            }else{
                System.out.println(nombre + " no es mayor de edad");
            }
            System.out.println("Quiere seguir ingresando personas? Para finalizar escriba -No-");
            respuesta=leer.next();
            respuesta=respuesta.toUpperCase();
            
            
            
            
        }while (!respuesta.equals("NO"));
        
        
    }
    
}
