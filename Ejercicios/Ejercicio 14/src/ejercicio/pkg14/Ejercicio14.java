/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicio.pkg14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        double euros;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = leer.nextDouble();
        convertir(euros, leer);
    }

    public static void convertir(double euros, Scanner leer) {
        String salir = "";
        do {
            System.out.println("1 - Convertir a libras");
            System.out.println("2 - Convertir a dólar");
            System.out.println("3 - Convertir a yenes");
            System.out.println("4 - Salir");

            int opcion;

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    libras(euros);
                    break;
                case 2:
                    dolar(euros);
                    break;
                case 3:
                    yenes(euros);
                    break;
                case 4:
                    salir = salir(leer);
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        }while (!salir.equalsIgnoreCase("S"));
    }
    public static void libras(double euros) {
        System.out.println(euros + " Euros convertidos son: " + euros * 0.86 + " libras");
        System.out.println("");
    }

    public static void dolar(double euros) {
        System.out.println(euros + " Euros convertidos son: " + euros * 1.28611 + " dólares");
        System.out.println("");
    }

    public static void yenes(double euros) {
        System.out.println(euros + " Euros convertidos son: " + euros * 129.852 + " yenes");
        System.out.println("");
    }
    
    public static String salir(Scanner leer){
        System.out.println("Desea salir? (S/N)");
        String respuesta;
        respuesta = leer.next();
        return respuesta;
    }
}



