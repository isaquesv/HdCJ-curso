package Secao004_EstruturasRepeticao.Projetos;

import java.util.Scanner;

/**
 *
 * Objetivo: O usuário precisa acertar um número aleatorio entre 1 e 100
 *
 * 1 - Criar um número aleatorio (1 e 100)
 * 2 - Pedir o palpite do usuário
 * 3 - Salvar as tentativas que foram erradas (contagem) - while até acertar
 * 4 - Enquanto o usuário não acerta, exibir se o numero alvo é maior ou menor que o palpite
 * 5 - Exibir mensagem de sucesso se ele acertar, com contagem de tentativas
 *
 */
public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 101);
        boolean palpiteEstaCorreto = false;
        int contadorTentativas = 0;

        while (!palpiteEstaCorreto) {
            System.out.println("Qual o seu palpite? (Deve ser um número inteiro positivo)");
            int palpite = sc.nextInt();
            contadorTentativas++;

            System.out.println();

            if (palpite == numeroAleatorio) {
                System.out.println("Muito bem! Você acertou! O número aleatório é: " + numeroAleatorio);
                palpiteEstaCorreto = true;
            } else {
                System.out.println("Não foi dessa vez! " + palpite + " não é o número sorteado! Tente novamente!");
            }
        }

        System.out.println("Você realizou " + contadorTentativas + " tentativas até acertar o número aleatório!");

        sc.close();
    }

}
