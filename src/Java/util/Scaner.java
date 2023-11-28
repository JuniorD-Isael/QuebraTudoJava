package Java.util;
import java.util.Random;
import java.util.Scanner;

public class Scaner {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static int nextInt() {
        int numero = scanner.nextInt();
        numero = random.nextInt(3);
        return numero;
    }

    public static double nextDouble() {
        double numero = scanner.nextDouble();
        numero = random.nextDouble(2300);
        return numero;
    }

    public static void main(String[] args) {
        System.out.println("Difite um valor inteiro");
        int numero =  nextInt();

        System.out.println(numero);
        System.out.println("Difite um valor real");
        double valor = nextDouble();
        System.out.println(valor);
    }

    public void close() {
    }
}
