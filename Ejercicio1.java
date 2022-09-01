
// Laboratorio Nro 21 - Ejercicio 1
// Autor: Fiorela Clariza Quispe Quispe
// En un arreglo unidimensional almacenar la tabla de multiplicar de cierto
// número con multiplicadores desde un m hasta un n. Luego mostrarla.
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicando, multiplicadorInf, multiplicadorSup;
        // Entradas
        System.out.print("Bienvenido(a), ingrese un número (multiplicando): ");
        multiplicando = scan.nextInt();
        System.out.print("Ingrese un número (multiplicador inicial): ");
        multiplicadorInf = scan.nextInt();
        System.out.print("Ingrese un número (multiplicador final): ");
        multiplicadorSup = scan.nextInt();
        // Se guarda los valores en un nuevo array, aunque podria ser directo...
        int[] multiplicadores = multiplicadores(multiplicadorInf, multiplicadorSup);
        System.out.println("\n\tTABLA DE MULTIPLICAR\n");
        // Imprime la tabla (salida)
        for (int i = 0; i < multiplicadores.length; i++) {
            System.out.println(
                    multiplicadores[i] + "\t*\t" + multiplicando + "\t=\t" + multiplicadores[i] * multiplicando);
        }
        scan.close();
    }

    public static int[] multiplicadores(int min, int max) {
        int[] valores = new int[max - min + 1];
        for (int i = 0; i < valores.length; min++, i++) {
            valores[i] = min;
        }
        return valores;
    }
}
