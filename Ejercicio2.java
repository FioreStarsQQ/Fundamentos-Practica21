
// Laboratorio Nro 21 - Ejercicio 2
// Autor: Fiorela Clariza Quispe Quispe
// En un arreglo unidimensional almacenar los nombres de los n amigos que tienes en facebook, luego mostrarlos.
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantAmigos;
        // Entradas
        System.out.print("Bienvenido(a), ingrese la cantidad de amigos: ");
        cantAmigos = scan.nextInt();
        String[] amigos = ingresarAmigos(cantAmigos);
        // Muestra los amigos
        System.out.println("Estos son los nombres ingresados:");
        for (int i = 0; i < amigos.length; i++) {
            System.out.println("- "+amigos[i]);
        }
        scan.close();
    }

    public static String[] ingresarAmigos(int cantidad) {
        Scanner scan = new Scanner(System.in);
        String[] nombresAmigos = new String[cantidad];
        for (int i = 0; i < nombresAmigos.length; i++) {
            System.out.print("Ingrese el nombre del amigo: ");
            nombresAmigos[i] = scan.nextLine();
        }
        scan.close();
        return nombresAmigos;
    }
}