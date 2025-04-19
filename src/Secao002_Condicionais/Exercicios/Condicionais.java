package Secao002_Condicionais.Exercicios;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercício 1: Verificação de Categoria de Preço");
        exercicio01(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 2: Validação de Login");
        exercicio02(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 3: Identificação de Paridade com Strings");
        exercicio03(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 4: Identificação de Dia Útil");
        exercicio04(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 5: Verificação de Intervalo com AND");
        exercicio05(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 6: Classificação de Letra");
        exercicio06(sc);

        sc.close();
    }

    public static void exercicio01(Scanner sc) {
        /*
            > Exercício 1: Verificação de Categoria de Preço

            Peça ao usuário para inserir o preço de um produto.
            Se o preço for menor que 50, categorize-o como "Barato".
            Se estiver entre 50 e 100, categorize como "Médio".
            Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
        */

        System.out.println("Insira o preço de um produto:");
        double precoProduto = sc.nextDouble();
        sc.nextLine();
        String categoria;

        if (precoProduto < 50) {
            categoria = "Barato";
        } else if (precoProduto >= 50 && precoProduto <= 100) {
            categoria = "Médio";
        } else {
            categoria = "Caro";
        }

        System.out.println();
        System.out.printf("Preço do produto: R$ %.2f\n", precoProduto);
        System.out.println("Categoria: " + categoria);
    }

    public static void exercicio02(Scanner sc) {
        /*
            > Exercício 2: Validação de Login

            Peça ao usuário para inserir um nome de usuário e uma senha.
            Verifique se o nome de usuário é "admin" e a senha é "1234".
            Se ambos forem corretos, exiba "Acesso permitido".
            Caso contrário, exiba "Acesso negado".
        */

        System.out.println("Insira um nome de usuário:");
        String nomeUsuario = sc.nextLine();

        System.out.println("Insira uma senha:");
        String senha = sc.nextLine();

        System.out.println();

        if (nomeUsuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado.");
        }
    }

    public static void exercicio03(Scanner sc) {
        /*
            > Exercício 3: Identificação de Paridade com Strings

            Peça ao usuário para inserir um número.
            Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar".
            Use uma string para armazenar o resultado e exibi-la.

            Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
        */

        System.out.println("Insira um número:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par");
        } else {
            System.out.println("O número " + numero + " é Ímpar");
        }
    }

    public static void exercicio04(Scanner sc) {
        /*
            > Exercício 4: Identificação de Dia Útil

            Peça ao usuário para inserir um número de 1 a 7,
            representando os dias da semana (1 para domingo, 2 para segunda, etc.).
            Use switch para verificar se o dia é um dia útil (segunda a sexta)
            ou final de semana (sábado e domingo).
            Exiba uma mensagem correspondente.
        */

        System.out.println("Insira um valor de 1 a 7:");
        int numeroDia = sc.nextInt();
        sc.nextLine();

        System.out.println();

        switch (numeroDia) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-feira!");
                break;
            case 3:
                System.out.println("Terça-feira!");
                break;
            case 4:
                System.out.println("Quarta-feira!");
                break;
            case 5:
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Dia inválido! (1 - 7)");
                break;
        }

        System.out.println();
    }

    public static void exercicio05(Scanner sc) {
        /*
            > Exercício 5: Verificação de Intervalo com AND

            Peça ao usuário para inserir um número.
            Verifique se o número está no intervalo de 10 a 20, inclusive.
            Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
        */

        System.out.println("Insira um número:");
        int numero = sc.nextInt();
        sc.nextLine();

        if (numero >= 10 && numero <= 20) {
            System.out.println("Dentro do intervalo! (10 - 20)");
        } else {
            System.out.println("Fora do intervalo!");
        }

        System.out.println();
    }

    public static void exercicio06(Scanner sc) {
        /*
            > Exercício 6: Classificação de Letra

            Peça ao usuário para inserir uma letra.
            Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante.
            Exiba "Vogal" ou "Consoante" de acordo com a entrada.
            Considere tanto letras maiúsculas quanto minúsculas.
        */

        System.out.println("Insira uma letra:");
        String letra = sc.next();

        if (letra.length() != 1) {
            System.out.println("Você deve inserir apenas 1 letra!");
            return;
        }

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println(letra + " é uma vogal!");
        } else {
            System.out.println(letra + " é uma consoante!");
        }
    }
}
