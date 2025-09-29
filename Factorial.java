package factorial;

public class Factorial {
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        } else {
            return n * calcularFactorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }
}
