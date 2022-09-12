/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package extras.ejercicio.pkg15;

import java.util.Scanner;

public class ExtrasEjercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        System.out.println("Ingrese 2 números para hacer cuentitas");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        calculadora(num1, num2, leer);
    }

    public static void calculadora(double num1, double num2, Scanner leer) {
        String letra;
        double resultado;

        do {
            System.out.println("================================");
            System.out.println("Qué cuentita querés hacer??");
            System.out.println("A - Sumar");
            System.out.println("B - Restar");
            System.out.println("C - Multiplicar");
            System.out.println("D - Dividir");
            System.out.println("E - Salir");
            System.out.println("================================");
            letra = leer.next();
            switch (letra.toUpperCase()) {
                case "A":
                    suma(num1, num2);
                    break;
                case "B":
                    resta(num1, num2);
                    break;
                case "C":
                    multiplicacion(num1, num2);
                    break;
                case "D":
                    division(num1, num2);
                    break;
            }
        } while (!letra.equalsIgnoreCase("E"));
        System.out.println("Gracias por usar mi calculadora");

    }

    public static void suma(double num1, double num2) {
        System.out.println("La suma es:" + (num1 + num2));
        System.out.println("================================");
    }

    public static void resta(double num1, double num2) {
        System.out.println("La resta es:" + (num1 - num2));
        System.out.println("================================");
    }

    public static void multiplicacion(double num1, double num2) {
        System.out.println("La multiplicacion es:" + (num1 * num2));
        System.out.println("================================");
    }

    public static void division(double num1, double num2) {
        System.out.println("La division es:" + (num1 / num2));
        System.out.println("================================");
    }
}
