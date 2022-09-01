// Laboratorio Nro 21 - Ejercicio 3
// Autor: Fiorela Clariza Quispe Quispe
// Simular n lanzamientos de un dado. Mostrar frecuencias de cada posibilidad de lanzamiento. Indicar cuál es el valor con mayor frecuencia.

public class Ejercicio3 {
    public static void main(String[] args) {
        int veces = 100000;
        int[] frecuencias = new int[6];
        for (int i = 0; i < veces; i++) {
            // suma acumulada del numero obtenido en el lanzamiento (se resto uno por la posicion ocupada)
            frecuencias[lanzamientoDado() - 1]++;
        }
        System.out.println("\t\t\tLanzamientos\tPosibilidad");
        for (int i = 0; i < frecuencias.length; i++) {
            double posibilidad;
            posibilidad = (double) Math.round(((frecuencias[i] * 0.1) / (0.1 * veces)) * 10000) / 100;
            System.out.println("Veces que se obtuvo " + (i + 1) + ":\t" + frecuencias[i] + "\t\t" + posibilidad + "%");
        }
        // se muestra el valor que fue más frecuente
        System.out.println("El número con mayor frecuencia fue: " + encontrarMayor(frecuencias));
    }

    // devuelde el numero del lanzamiento de un dado
    public static int lanzamientoDado() {
        return (int) (Math.random() * 6) + 1;
    }

    // retorna solamente la posicion del numero que fue elegido varias veces
    public static int encontrarMayor(int[] arreglo) {
        int mayor, valor = 0;
        mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                valor = i;
            }
        }
        // se le aumento la unidad para dar con el numero del dado
        return ++valor;
    }
}
