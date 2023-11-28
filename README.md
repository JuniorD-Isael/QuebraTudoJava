# Banco Vai na Web - Sistema Simples de Banco

Este é um sistema simples de banco que permite criar contas para clientes, calcular gastos usando uma calculadora básica e visualizar os dados da conta criada.

## Estrutura do Projeto

O projeto está dividido em pacotes para organizar as classes:

- **br.com.bancoVaiNaWeb** - Pacote raiz
  - **conta** - Classes relacionadas às contas bancárias
  - **cliente** - Classes que representam os clientes do banco
  - **operacoes** - Funcionalidades como criação de conta, operações matemáticas e controle principal

### Principais Classes

- **Main.java** - Contém a classe principal do programa. Permite a interação com o usuário para calcular gastos, criar contas e visualizar dados da conta.
- **Conta.java** - Classe que define a estrutura de uma conta bancária, incluindo número, saldo e dados do cliente.
- **Cliente.java** - Representa o cliente com nome e CPF.
- **CriarConta.java** - Classe responsável pela criação de uma nova conta com dados inseridos pelo usuário.
- **Calculadora.java** - Oferece funcionalidades de uma calculadora simples: soma, subtração, multiplicação e divisão.

## Como Executar

1. Certifique-se de ter o Java instalado no seu ambiente.
2. Clone ou baixe este repositório.
3. Compile os arquivos Java: `javac Main.java`
4. Execute o programa: `java Main`

## Funcionalidades

- **1: Calcular seus gastos** - Uma calculadora simples permite ao usuário realizar operações matemáticas básicas.
- **2: Criar uma conta** - Permite ao usuário inserir seus dados para criar uma conta bancária.
- **3: Verificar dados da sua conta** - Mostra os dados da conta bancária criada.

## Observações

- Certifique-se de inserir corretamente os dados solicitados para criar uma conta com sucesso.
- O programa encerra quando a opção '0: Sair' é escolhida.
