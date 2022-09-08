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
        String socio = "";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su tipo de socio");
        menu(socio, leer);
    }

    public static void menu(String socio, Scanner leer) {
        double precio = 0;
        int seleccionar = 0;
        String salir = "";

        System.out.println("1 - Radiografía $1500");
        System.out.println("2 - Análisis de sangre $1000");
        System.out.println("3 - Análisis de orina $1000");
        System.out.println("4 - Ecografía $2000");
        System.out.println("5 - Salir");
        seleccionar = leer.nextInt();

        switch (seleccionar) {

            case 1:
                System.out.println("A - Socio Full");
                System.out.println("B - Socio medio");
                System.out.println("C - NO Socio");
                socio = leer.next();
                do {
                    switch (socio) {
                        case "A":
                        case "a":
                            System.out.println("El precio de la radiografía es de: $" + 1500 * 0.5);
                            System.out.println("");
                            break;
                        case "B":
                        case "b":
                            System.out.println("El precio de la radiografía es de: $" + 1500 * 0.65);
                            System.out.println("");
                            break;
                        case "C":
                        case "c":
                            System.out.println("El precio de la radiografía es de: $" + 1500);
                            System.out.println("");
                            break;
                        case "D":
                        case "d":
                    }
                } while (!salir.equalsIgnoreCase("S"));

            case 2:
                System.out.println("A - Socio Full");
                System.out.println("B - Socio medio");
                System.out.println("C - NO Socio");
                socio = leer.next();
                switch (socio) {
                    case "A":
                    case "a":
                        System.out.println("El precio del Análisis de sangre es de: $" + 1000 * 0.5);
                        System.out.println("");
                        break;
                    case "B":
                    case "b":
                        System.out.println("El precio del Análisis de sangre es de: $" + 1000 * 0.65);
                        System.out.println("");
                        break;
                    case "C":
                    case "c":
                        System.out.println("El precio del Análisis de sangre es de: $" + 1000);
                        System.out.println("");
                        break;
                }

            case 3:
                System.out.println("A - Socio Full");
                System.out.println("B - Socio medio");
                System.out.println("C - NO Socio");
                socio = leer.next();
                switch (socio) {
                    case "A":
                    case "a":
                        System.out.println("El precio del Análisis de orina es de: $" + 1000 * 0.5);
                        System.out.println("");
                        break;
                    case "B":
                    case "b":
                        System.out.println("El precio del Análisis de orina es de: $" + 1000 * 0.65);
                        System.out.println("");
                        break;
                    case "C":
                    case "c":
                        System.out.println("El precio del Análisis de orina es de: $" + 1000);
                        System.out.println("");
                        break;
                }
            case 4:
                System.out.println("A - Socio Full");
                System.out.println("B - Socio medio");
                System.out.println("C - NO Socio");
                socio = leer.next();
                do {
                    switch (socio) {
                        case "A":
                        case "a":
                            System.out.println("El precio de la Ecografía es de: $" + 2000 * 0.5);
                            System.out.println("");
                            break;
                        case "B":
                        case "b":
                            System.out.println("El precio de la Ecografía es de: $" + 2000 * 0.65);
                            System.out.println("");
                            break;
                        case "C":
                        case "c":
                            System.out.println("El precio de la Ecografía es de: $" + 2000);
                            System.out.println("");
                            break;
                        case "D":
                        case "d":
                            System.out.println("Seguro que quiere salir?? (S/N)");
                        default:
                            System.out.println("Ingresó una opción no valida");
                    }
                }while (!salir.equalsIgnoreCase("S"));
                
        }
    }
}
