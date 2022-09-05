/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio.pkg11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número entero positivo");
        num1 = leer.nextInt();

        while (num1 < 1) {
            System.out.println("No lees? Dije entero positivo");
            num1 = leer.nextInt();
        }
        System.out.println("Ingrese otro número, también entero positivo");
        num2 = leer.nextInt();
        while (num2 < 1) {
            System.out.println("Hay que ser!! Dije entero positivo");
            num2 = leer.nextInt();
        }
        menu(num1, num2, leer);
    }

    public static void menu(int num1, int num2, Scanner leer) {
        String salir = "";
        do {
            System.out.println("Menú");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("====================================");
            System.out.println("Ingrese el número de opción del menú");
            int opcion;

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    opcion1(num1, num2);
                    break;
                case 2:
                    opcion2(num1, num2);
                    break;
                case 3:
                    opcion3(num1, num2);
                    break;
                case 4:
                    opcion4(num1, num2);
                    break;
                case 5:
                    salir = opcion5(leer);
                    break;
                default:
                    System.out.println("Opción no valida");
                    System.out.println("Por favor, vuelva a ingresar la opción");
            }

        } while (!salir.equalsIgnoreCase("s"));

    }

    public static void opcion1(int num1, int num2) {
        System.out.println("La suma de los números es: " + (num1 + num2));
    }

    public static void opcion2(int num1, int num2) {
        System.out.println("La resta de los números es: " + (num1 - num2));
    }

    public static void opcion3(int num1, int num2) {
        System.out.println("La multiplicación de los números es: " + (num1 * num2));
    }

    public static void opcion4(int num1, int num2) {
        double resultado = num1 / num2;
        System.out.println("La división de los números es: " + resultado);
    }

    public static String opcion5(Scanner leer) {
        System.out.println("Está seguro que desea salir? (S/N)");
        String respuesta;
        respuesta = leer.next();
        return respuesta;
    }
}
