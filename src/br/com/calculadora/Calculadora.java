package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void calcularGastos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = scanner.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = soma(num1, num2);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
        }
        System.out.println(resultado);
    }

    // Função de soma
    public static double soma(double a, double b) {
        return a + b;
    }

    // Função de subtração
    public static double subtracao(double a, double b) {
        return a - b;
    }

    // Função de multiplicação
    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    // Função de divisão
    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }
}
