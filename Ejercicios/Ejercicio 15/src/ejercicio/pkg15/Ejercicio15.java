/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicio.pkg15;

public class Ejercicio15 {

    public static void main(String[] args) {
        int vec[] = new int[100];
        System.out.println("Vamos a imprimir un vector con los números desde 100 a 1");
        inicializarVector(vec);
            
    }
        public static void inicializarVector(int [] vec) {
        for (int i = 100; i > 0; i--) {
            System.out.println("[" + i + "]");
            
        }
            
                
            }
    }


 