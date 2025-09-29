package sumanaturales;

public class SumaNaturales {
    public static int sumaNaturales(int n) {
        if (n == 1) { 
            return 1;
        } else {
            return n + sumaNaturales(n - 1); 
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("La suma de los primeros " + numero + " números naturales es: " + sumaNaturales(numero));
    }
}
