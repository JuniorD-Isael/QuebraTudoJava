package br.com.bancoVaiNaWeb;

import java.util.Random;

import java.util.Scanner;

public class CriarConta {
    public static Conta criarConta() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Que bom que você quer ser nosso cliente!" + "vamos começar:");
        // Vamos criar o dados do cliente
        System.out.println("Primeiro seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Agora seu CPF");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        // Agora a conta
        System.out.println("Qual valor você deseja depositar ?");
        double saldo = scanner.nextDouble();
        int numero = random.nextInt(101);
        Conta conta = new Conta(numero, saldo, cliente);
        return conta;
    }
}
