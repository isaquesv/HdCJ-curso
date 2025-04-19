package Secao004_EstruturasRepeticao.Exercicios;

import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercício 1: Somatório com for");
        exercicio01();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 2: Impressão de Números Pares com while");
        exercicio02();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 3: Verificação de Número Primo com for");
        exercicio03(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 4: Menu Interativo com do-while");
        exercicio04(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 5: Fatorial de um Número com for");
        exercicio05(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 6: Contagem de Dígitos de um Número com while");
        exercicio06(sc);

        sc.close();
    }

    public static void exercicio01() {
        /*
             > Exercício 1: Somatório com for

             Crie um programa que use um loop for para calcular
             o somatório dos números de 1 a 100 e exiba o resultado.
             1 + 2 + 3... = x
        */

        String calculo = "0";
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            calculo += " + " + i;
            soma += i;
        }

        calculo += " = " + soma;
        System.out.println(calculo);
    }

    public static void exercicio02() {
        /*
             > Exercício 2: Impressão de Números Pares com while

             Desenvolva um programa que use um loop while para imprimir
             todos os números pares de 1 a 20.
        */

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void exercicio03(Scanner sc) {
        /*
             > Exercício 3: Verificação de Número Primo com for

             Escreva um programa que receba um número do usuário
             e use um loop for para verificar se ele é primo.
        */

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
            System.out.println();
            return;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("O número " + numero + " não é primo.");
                System.out.println();
                return;
            }
        }

        System.out.println("O número " + numero + " é primo!");
    }

    public static void exercicio04(Scanner sc) {
        /*
             > Exercício 4: Menu Interativo com do-while

             Crie um programa que exiba um menu interativo usando do-while,
             permitindo ao usuário escolher opções até que ele decida sair.

             // menu de opcoes com print: 1) comida 2) bebida
             // um numero aleatorio que mediante a ser X, pare o loop
        */

        int numero = 0;
        int x = (int) (Math.random() * 100) + 3;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1) comida");
            System.out.println("2) bebida");
            System.out.println(x + ") parar o loop");
            numero = sc.nextInt();
        }
        while (numero != x);
    }

    public static void exercicio05(Scanner sc) {
        /*
             > Exercício 5: Fatorial de um Número com for

             Desenvolva um programa que calcule o
             fatorial de um número inteiro positivo usando um loop for.

             5 * 4 * 3 * 2 * 1

             1 * 2 * 3 * 4 * 5
        */

        System.out.println("Insira um número inteiro que você deseja saber o fatorial:");
        int numero = sc.nextInt();
        int fatorial = numero;

        for (int i = 1; i < numero; i++) {
            fatorial *= numero - i;
        }

        System.out.println(fatorial);
    }

    public static void exercicio06(Scanner sc) {
        /*
             > Exercício 6: Contagem de Dígitos de um Número com while

             Crie um programa que conte quantos dígitos há em um número inteiro positivo
             usando um loop while.

             1000 = 4 digitos
         */

        System.out.println("Insira um número inteiro positivo:");
        int numero = sc.nextInt();
        int contadorDigitos = 0;

        while (numero > 0) {
            numero /= 10; //
            contadorDigitos++;
        }

        System.out.println("O número possui " + contadorDigitos + " dígito(s).");
    }
}
