package Secao001_Variaveis.Exercicios;

public class Variaveis {

    public static void main(String[] args) {
        System.out.println("Exercício 1: Trabalhando com variáveis e operadores aritméticos");
        exercicio01();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 2: Conversão de tipos (casting) de char para int");
        exercicio02();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 3: Soma de valores double");
        exercicio03();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 4: Conversão de long para int com casting explícito");
        exercicio04();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 5: Trabalhando com String e concatenação de textos");
        exercicio05();
    }

    public static void exercicio01() {
        /*
            Exercício 1: Trabalhando com variáveis e operadores aritméticos

            Crie uma variável int para armazenar o valor 10.
            Crie uma segunda variável int que armazene o dobro do valor da primeira variável
            usando operadores aritméticos.
            Exiba o resultado.
        */

        int numero = 10;
        int dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é " + dobro);
    }

    public static void exercicio02() {
        /*
            Exercício 2: Conversão de tipos (casting) de char para int

            Declare uma variável char que armazene a letra 'B'.
            Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.
        */

        char caractere = 'B';

        System.out.println(caractere + " possui o seguinte valor numérico: " + (int) caractere);
    }

    public static void exercicio03() {
        /*
            Exercício 3: Soma de valores double

            Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
            Some os valores dessas variáveis e armazene o resultado em uma nova variável double.
            Exiba o resultado.
         */

        double numero = 15.75;
        double outroNumero = 20.40d;
        double soma = numero + outroNumero;

        System.out.println(numero + " + " + outroNumero + " = " + soma);
    }

    public static void exercicio04() {
        /*
            Exercício 4: Conversão de long para int com casting explícito

            Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000).
            Em seguida, declare uma variável int e faça o casting explícito do valor long para int.
            Exiba o resultado.
        */

        long doisBilhoes = 2_000_000_000;
        long outrosDoisBilhoes = 2000000000;
        int inteiro = (int) doisBilhoes;

        System.out.println("De long para int = " + inteiro);
    }

    public static void exercicio05() {
        /*
            Exercício 5: Trabalhando com String e concatenação de textos

            Escreva um programa que crie uma variável String com o valor "Olá, Mundo!".
            Em seguida, crie outra variável String que concatene a primeira variável com o texto
            " Bem-vindo ao Java!".
            Exiba o resultado.
        */

        String ola = "Olá, Mundo!";
        String bemVindo = " Bem-vindo ao Java!";

        System.out.println(ola + bemVindo);
    }
}
