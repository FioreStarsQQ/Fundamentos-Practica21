
// Laboratorio Nro 21 - Ejercicio 4
// Autor: Fiorela Clariza Quispe Quispe
// En un juego de dados que consiste en lanzar 2 dados y ver su suma. Imprimir tipo tabla las frecuencias de cada suma posible. Confirmar que el 7 es la suma con más probabilidad. Hacer un experimento con n lanzamientos.
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] frecuenciaSuma = new int[11];
        int lanzamientos;
        System.out.print("Ingrese el numero de lanzamientos: ");
        lanzamientos = scan.nextInt();

        frecuenciaSuma = arregloFrecuencias(lanzamientos);
        System.out.println("\t\t\tLanzamientos\tPosibilidad");
        for (int i = 0; i < frecuenciaSuma.length; i++) {
            double posibilidad;
            posibilidad = (double) Math.round(((frecuenciaSuma[i] * 0.1) / (0.1 * lanzamientos)) * 10000) / 100;
            System.out
                    .println("Veces que se obtuvo " + (i + 2) + ":\t" + frecuenciaSuma[i] + "\t\t" + posibilidad + "%");
        }
        // se muestra la suma que fue más frecuente
        System.out.println("El número con mayor frecuencia fue: " + encontrarMayor(frecuenciaSuma));
        scan.close();
    }

    // devuelde el numero del lanzamiento de un dado
    public static int lanzamientoDado() {
        return (int) (Math.random() * 6) + 1;
    }
    // retorna la suma de dos valores
    public static int sumaValores(int a, int b) {
        return a + b;
    }
    // retorna el arreglo con la frecuencia de sumas 
    public static int[] arregloFrecuencias(int lanzamientos) {
        int[] frecuencias = new int[11];
        for (int i = 0; i < lanzamientos; i++) {
            // suma acumulada de la suma obtenida en los lanzamientos (se resto dos por la
            // posicion ocupada)
            frecuencias[(sumaValores(lanzamientoDado(), lanzamientoDado())) - 2]++;
        }
        return frecuencias;
    }
    // retorna la posicion aumentada en dos de la suma que fue mas frecuente en el arreglo
    public static int encontrarMayor(int[] arreglo) {
        int mayor, valor = 0;
        mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                valor = i;
            }
        }
        // se le aumento dos porque el valor de la suma en la posicion cero es dos
        return valor + 2;
    }
}
