/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio.pkg12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        String palabra;
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 5 letras (ni más, ni menos)");
        System.out.println("Vamos a contar cuántas palabras comienzan con X y finalizan con O");
        

        do{
            
            palabra = leer.nextLine().toUpperCase();
            System.out.println("Sigamos ingresando palabras");
            if (palabra.length() > 5) {
                System.out.println("Ingresó una palabra de más de 5 letras");
                contador1 = contador1 + 1;
            }
            if (palabra.length() < 5) {
                System.out.println("Ingresó una palabra de mnos de 5 letras");
                contador2 = contador2 + 1;
            }
            if (palabra.length() == 5) {

                if (palabra.substring(0, 1).equals("X") && palabra.substring(4, 5).equals("O")) {
                    System.out.println("Ingresó una palabra que empieza con X y finaliza con O");
                    contador3 = contador3 + 1;
                } else {
                    System.out.println("Ingresó una palabra de 5 letras, pero no cumple requisito");
                    contador4 = (contador4 + 1);
                }
                

            }
            
        } while (!palabra.equals("&&&&&"));
        
                System.out.println("-------------------------------------------------------------");
                System.out.println("Las palabras que tienen menos de 5 letras son: " + contador2);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Las palabras que tienen más de 5 letras son: " + contador1);
                System.out.println("-------------------------------------------------------------");
                System.out.println("Las palabras de 5 letras que no cumplen con el requisito son: " + contador4);
                System.out.println("-------------------------------------------------------------");
                System.out.println("En total las palabras que no cumplen requisito son: " + (contador1 + contador2 + contador4-1));
                System.out.println("-------------------------------------------------------------");
                System.out.println("Las palabras que empiezan en X y finalizan en O son: " + contador3);
                System.out.println("-------------------------------------------------------------");
    }
}
