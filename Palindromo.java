package palindromo;

import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");
        if (palabra.length() <= 1) {
            return true;
        }
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }
        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase para verificar si es palindromo: ");
        String palabra = scanner.nextLine();

        boolean resultado = esPalindromo(palabra);
        System.out.println("Es palindromo? " + resultado);

        scanner.close();
    }
}
