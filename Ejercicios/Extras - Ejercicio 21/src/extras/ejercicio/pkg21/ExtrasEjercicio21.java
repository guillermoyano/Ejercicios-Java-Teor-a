/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.

 */
package extras.ejercicio.pkg21;

import java.util.Scanner;

public class ExtrasEjercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double vector[] = new double[10];
        int alumnos = 10, contador = 0, contador2 = 0, contadoraprobados = 0, contadordesaprobados=0;
        double primerintegador, segundointegrador, primerTP, segundoTP, promedio;

        do {
            System.out.println("Ingrese la nota del alumno " + (contador + 1) + " del primer TP");
            primerTP = leer.nextDouble();
            primerTP = primerTP * 0.1;
            System.out.println("Ingrese la nota del alumno " + (contador + 1) + " del primer integrador");
            primerintegador = leer.nextDouble();
            primerintegador = primerintegador * 0.15;
            System.out.println("Ingrese la nota del alumno " + (contador + 1) + " del segundo TP");
            segundoTP = leer.nextDouble();
            segundoTP = segundoTP * 0.25;
            System.out.println("Ingrese la nota del alumno " + (contador + 1) + " del Integrador integrador");
            segundointegrador = leer.nextDouble();
            segundointegrador = segundointegrador * 0.5;
            promedio = (primerintegador + segundointegrador + primerTP + segundoTP);
            vector[contador] = promedio;
            contador++;
        } while (contador != 10);
        for (int i = 0; i < 10; i++) {
            if (vector[i] >= 7) {
                contadoraprobados++;
            } else {
                contadordesaprobados++;
            }
        }
        System.out.println("La cantidad de aprobados es: " + contadoraprobados);
        System.out.println("La cantidad de desaprobados es: " +contadordesaprobados);
    }
}
