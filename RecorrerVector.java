package recorrervector;

import java.util.Scanner;

public class RecorrerVector {
    public static void mostrarVector(int[] vector, int indice) {
        if (indice >= vector.length) {
            return;
        } else {
            System.out.println("Posicion " + indice + ": " + vector[indice]);
            mostrarVector(vector, indice + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del vector: ");
        int tamano = scanner.nextInt();
        int[] miVector = new int[tamano];

        System.out.println("Ingresa los elementos del vector:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + i + ": ");
            miVector[i] = scanner.nextInt();
        }

        System.out.println("\nRecorriendo el vector:");
        mostrarVector(miVector, 0);

        scanner.close();
    }
}
