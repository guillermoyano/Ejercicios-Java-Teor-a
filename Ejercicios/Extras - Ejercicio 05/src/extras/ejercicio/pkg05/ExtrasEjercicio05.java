/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package extras.ejercicio.pkg05;

import java.util.Scanner;

public class ExtrasEjercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        boolean resp = false;
        System.out.println("Clase de socio:");
        System.out.println("Socio Mayor - (A)");
        System.out.println("Socio Moderado - (B)");
        System.out.println("Socio Comun - (C)");
        System.out.println("Ingrese A, B o C:");
        do{
        clase = leer.next();
        clase = clase.toUpperCase();
        if(clase.equals("A")||clase.equals("B")||clase.equals("C")){
            resp = false;
            break;
        }else
                System.out.println("Solo A, B o C...");
        
        }while(resp = true);
    Obra(clase,leer);
    }
    
    public static void Obra(String clase, Scanner leer){
        System.out.println("Ingrese el importe para el tratamiento:");
        double importe = leer.nextDouble();
        clase=clase.toUpperCase();
        System.out.println("");
        switch(clase){
            case "A":
                System.out.println("Su tratamiento tendra un 50% de descuento");
                System.out.println("Importe = $ "+(importe-(importe*0.50)));
                break;
            case "B":
                System.out.println("Su tratamiento tendra un 35% de descuento");
                System.out.println("Importe = $ "+(importe-(importe*0.35)));
                break;
            case "C":
                System.out.println("Su tratamiento no tendra descuento");
                System.out.println("Importe = $ "+importe);
                break;
        }
    }
}