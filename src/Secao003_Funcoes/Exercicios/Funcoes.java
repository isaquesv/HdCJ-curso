package Secao003_Funcoes.Exercicios;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercício 1: Função para Converter Temperatura");
        exercicio01(sc);

        System.out.println("Exercício 2: Função para Calcular o Fatorial de um Número");
        exercicio02(sc);

        System.out.println("Exercício 3: Função com if-else para Verificar Paridade");
        exercicio03(sc);

        System.out.println("Exercício 4: Função com switch para Classificar Notas");
        exercicio04(sc);

        System.out.println("Exercício 5: Função com System.exit para Verificar Idade");
        exercicio05(sc);

        System.out.println("Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número");
        exercicio06(sc);

        sc.close();
    }

    public static void exercicio01(Scanner sc) {
        /*
            > Exercício 1: Função para Converter Temperatura

            Crie uma função que converta uma temperatura de Celsius para Fahrenheit.
            A função deve receber a temperatura em Celsius como argumento
            e retornar o valor correspondente em Fahrenheit.
            Exiba o resultado encapsulado em uma variável.
        */

        System.out.println("Insira uma temperatura em Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);

        System.out.println(celsius + "ºC = " + fahrenheit + "ºF");
        System.out.println();
        sc.nextLine();
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void exercicio02(Scanner sc) {
        /*
            > Exercício 2: Função para Calcular o Fatorial de um Número

            Crie uma função que calcule o fatorial de um número inteiro.
            Teste a função com um número de sua escolha.
        */

        System.out.println("Insira um número inteiro que você deseja ver o fatorial:");
        int numero = (int) sc.nextInt();
        int fatorial = calcularFatorial(numero);

        if (fatorial > 0) {
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        System.out.println();
    }

    // Fatorial = n * (n - 1) * (n - 2) * ... * 1
    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("O fatorial de um número negativo não é definido.");
            return -1;
        }

        if (numero == 0 || numero == 1) {
            return 1;
        }

        int i = 1;
        int fatorial = numero;

        while (i < numero) {
            fatorial *= (numero-i);
            i++;
        }

        return fatorial;
    }

    public static void exercicio03(Scanner sc) {
        /*
            > Exercício 3: Função com if-else para Verificar Paridade

            Crie uma função que receba um número inteiro
            e retorne uma string indicando se o número é "Par" ou "Ímpar".
            Use condicionais if-else para determinar a paridade.
        */

        System.out.println("Insira um número inteiro:");
        int numero = (int) sc.nextInt();

        String paridade = getParidade(numero);
        System.out.println("O número " + numero + " é " + paridade);
        System.out.println();
    }

    public static String getParidade(int numero) {
        return (numero % 2 == 0) ? "Par": "Ímpar";
    }

    public static void exercicio04(Scanner sc) {
        /*
            > Exercício 4: Função com switch para Classificar Notas

            Crie uma função que receba uma nota de 0 a 10

            10 e 9: A, 8: B, 7: C, 6: D, restante F

            e retorne uma classificação de letra (A, B, C, D, F) usando um switch.
            Inclua uma verificação para garantir que a nota está dentro do intervalo válido.
        */

        System.out.println("Insira uma nota (0 - 10):");
        int nota = (int) sc.nextInt();

        if (nota >= 0 && nota <= 10) {
            String classificacaoNota = getClassificacaoNota(nota);

            System.out.println("Classificação da nota " + nota + ": " + classificacaoNota);
        } else {
            System.out.println("A nota deve estar no intervalo de 0 a 10!");
        }

        System.out.println();
    }

    public static String getClassificacaoNota(int nota) {
        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void exercicio05(Scanner sc) {
        /*
            > Exercício 5: Função com System.exit para Verificar Idade

            Crie uma função que receba a idade de uma pessoa.
            Se a idade for menor que 18, use System.exit(0)
            para encerrar o programa com uma mensagem de "Acesso negado".
            Caso contrário, exiba "Acesso permitido".
        */

        System.out.println("Insira uma idade:");
        int idade = (int) sc.nextInt();

        verificarMaioridade(idade);
        System.out.println();
    }

    public static void  verificarMaioridade(int idade) {
        if (idade < 18) {
            System.out.println("Acesso negado.");
            System.exit(0);
        } else {
            System.out.println("Acesso permitido!");
        }
    }

    public static void exercicio06(Scanner sc) {
        /*
            > Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número

            Crie uma função que receba um array de inteiros
            e retorne o maior número presente no array.
            Utilize um loop para percorrer os elementos do array e identificar o maior valor.
        */

        System.out.println("Qual deve ser o tamanho de sua lista?");
        int quantidadeNumeros = (int) sc.nextInt();
        int[] numeros = new int[quantidadeNumeros];
        int maior = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Qual número vai ocupar o " + (i+1) + "º espaço da lista?");
            numeros[i] = (int) sc.nextInt();

            if (i == 0 || numeros[i] > quantidadeNumeros) {
                maior = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
    }

}