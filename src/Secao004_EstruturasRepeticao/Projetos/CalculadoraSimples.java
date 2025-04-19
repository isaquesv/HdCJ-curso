package Secao004_EstruturasRepeticao.Projetos;

import java.util.Scanner;

/**
 *
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
 *
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário seleciou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro
 *
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        double numero = sc.nextDouble();

        System.out.println("Insira outro número:");
        double outroNumero = sc.nextDouble();

        System.out.println();
        System.out.println("Lista de operações:");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");
        int escolhaUsuario = sc.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 4) {
            System.out.println(escolhaUsuario + " não é uma opção!");
        }

        switch (escolhaUsuario) {
            case 1:
                double adicao = numero + outroNumero;
                System.out.printf("%.2f + %.2f = %.2f\n", numero, outroNumero, adicao);
                break;
            case 2:
                double subtracao = numero - outroNumero;
                System.out.printf("%.2f 0 %.2f = %.2f\n", numero, outroNumero, subtracao);
                break;
            case 3:
                double multiplicacao = numero * outroNumero;
                System.out.printf("%.2f * %.2f = %.2f\n", numero, outroNumero, multiplicacao);                break;
            case 4:
                if (numero == 0 || outroNumero == 0) {
                    System.out.println("Não é possível realizar divisões com 0!");
                    return;
                }

                double divisao = numero / outroNumero;
                System.out.printf("%.2f / %.2f = %.2f\n", numero, outroNumero, divisao);
                break;
        }

        sc.close();
    }

}
