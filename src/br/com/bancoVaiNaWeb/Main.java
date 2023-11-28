package br.com.bancoVaiNaWeb;

import java.util.Scanner;

import static br.com.calculadora.Calculadora.calcularGastos;


public class Main {
    public static void main(String[] args) {
        Conta conta = null;
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco vai na Web!\n" +
                "O que deseja fazer hoje ?\n" +
                "Escolha uma opção:");
        while (opcao != 0) {

            System.out.println("1: Calcular seus gastos"); // Uma calculadora simples
            System.out.println("2: Criar uma conta: "); // Crie uma conta
            System.out.println("3: Verificar dados da sua conta");
            System.out.println("0: Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularGastos();
                    break;
                case 2:
                    conta = CriarConta.criarConta();
                    break;
                case 3:
                    if (conta != null) {
                        conta.visualizarDadosConta();
                    } else {
                        System.out.println("Crie uma conta primeiro!");
                    }
                    break;
            }

        }
        scanner.close();
    }
}
