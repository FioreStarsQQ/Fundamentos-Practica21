
// Laboratorio Nro 21 - Ejercicio 5
// Autor: Fiorela Clariza Quispe Quispe
// Simular las notas [0..20] de una clase de n alumnos, calcular la frecuencia, indicar la nota con mayor y menor frecuencia, y que me muestre tipo histograma los resultados
// 0 *****
// 1 ***
// 2 ***
// …
// 18 **
// 19 *
// 20

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] frecuenciaNotas = new int[21];
        int estudiantes;
        System.out.print("Ingrese el numero de estudiantes: ");
        estudiantes = scan.nextInt();
        frecuenciaNotas = arregloFrecuencias(estudiantes);
        // Bucle que imprime la frecuencia de notas
        for (int i = 0; i < frecuenciaNotas.length; i++) {
            System.out.print("- " + i + " ");
            for (int j = 1; j <= frecuenciaNotas[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" (" + frecuenciaNotas[i] + ")\n");
        }     
        // Salida de la mayor y menor nota   
        System.out.println("El número con mayor frecuencia fue: " + encontrarMayor(frecuenciaNotas));
        System.out.println("El número con menor frecuencia fue: " + encontrarMenor(frecuenciaNotas));
        scan.close();
    }

    // devuelde una nota aleatoria
    public static int notaAleatoria() {
        return (int) (Math.random() * 21);
    }
    // retorna el arreglo con la frecuencia de todas las notas
    public static int[] arregloFrecuencias(int cantidad) {
        int[] frecuencias = new int[21];
        for (int i = 0; i < 21; i++) {
            // devuelve con cero tadas las posiciones del arreglo
            frecuencias[i] = 0;
        }
        for (int i = 0; i < cantidad; i++) {
            // suma acumulada de las notas repetidas
            frecuencias[notaAleatoria()]++;
        }
        return frecuencias;
    }
    // retorna el valor de la posicion con la nota que se repitio más
    public static int encontrarMayor(int[] arreglo) {
        int mayor, valor = 0;
        mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                valor = i;
            }
        }
        return valor;
    }    // retorna el valor de la posicion con la nota que menos se repitio
    public static int encontrarMenor(int[] arreglo) {
        int menor, valor = 0;
        menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
                valor = i;
            }
        }
        return valor;
    }
}