
package extras.ejercicio.pkg23.otro.mas;

import java.util.Scanner;

public class ExtrasEjercicio23OtroMas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String matrizsopa[][] = new String[20][20];
        String matrizpalabra[][] = new String[5][5];
        int aleatorio[] = new int[5];
        int contador = 0;
        int i = 0;
        System.out.println("Ingrese 5 palabras para la Sopa de Letras");
        do {
            System.out.println("Palabra N° " + (contador + 1));
            String palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("la palabra a ingresar debe tener de 3 a 5 caracteres, por favor...");
                System.out.println("Intente de nuevo:");
                palabra = leer.next();
                palabra = palabra.toUpperCase();
            }
            for (int j = 0; j < matrizpalabra[0].length; j++) {
                if (j <= palabra.length() - 1) {
                    matrizpalabra[i][j] = palabra.substring(j, j + 1);
                } else {
                    matrizpalabra[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
            i++;
            contador++;
        } while (contador < 5);
        for (int j = 0; j < 5; j++) {
            boolean bandera = false;
            do {
                aleatorio[j] = (int) (Math.random() *20);
                for (int k = 0; k < j; k++) {
                    if (aleatorio[j] == aleatorio[k]) {
                        bandera = true;
                        break;
                    } else {
                        bandera = false;
                    }
                }
            } while (bandera == true);
        }
        System.out.println("");
        for (int k = 0; k < matrizpalabra.length; k++) {
            for (int l = 0; l < matrizpalabra[0].length; l++) {
                matrizsopa[aleatorio[k]][l] = matrizpalabra[k][l];
            }
        }
        System.out.println("----S O P A---D E---L E T R A S----");
        System.out.println(" ");
        for (int j = 0; j < matrizsopa.length; j++) {
            for (int z = 0; z < matrizsopa[0].length; z++) {
                if (matrizsopa[j][z] == null) {
                    matrizsopa[j][z] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print("[" + matrizsopa[j][z] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}