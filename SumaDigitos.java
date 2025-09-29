
package sumadigitos;

import java.util.Scanner;

public class SumaDigitos {
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo: ");
        int numero = scanner.nextInt();

        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los digitos es: " + resultado);

        scanner.close();
    }
}
