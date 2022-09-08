/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package extras.ejercicio.pkg03;

import java.util.Scanner;

public class ExtrasEjercicio03 {

    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra y comprobaremos que sea una vocal");
        letra = leer.next();
        System.out.println("");

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra -" + letra + "- ingresada es una vocal");

        } else {
            System.out.println("La letra -" + letra + "- ingresada no corresponde a una vocal");

        }
    }
}
