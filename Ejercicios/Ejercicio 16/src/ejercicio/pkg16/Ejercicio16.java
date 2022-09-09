/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicio.pkg16;


import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int num, numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();
        int vec[] = new int[num];
        llenarVector(vec, num);
        System.out.println("Ingrese el número a buscar en el vector");
        numero = leer.nextInt();
        buscarNumero(vec, numero);
    }

    public static void llenarVector(int vec[], int num) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
            System.out.println(vec[i] + " ");

        }
    }

    public static void buscarNumero(int vec[], int numero) {
        int contador = 0;
        for (int i = 0; i < vec.length; i++) {
            if (numero == vec[i]) {
                contador++;
                System.out.println("El número se encuentra en la posición: " + (i + 1));
            }
        }
        if (contador != 0) {
            if (contador==1){
                System.out.println("El número se encontró una vez ");
            }else{
                System.out.println("El número se encontró " + contador + " veces");
            }
        } else {
            System.out.println("El número no se encontró en el vector");
        }

    }

}
