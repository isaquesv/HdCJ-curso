package Secao003_Funcoes.Projetos;

import java.util.Scanner;

/**
 *
 * Objetivo - Criar um projeto que conta as palavras de uma frase
 *
 * 1 - Obter uma frase do usuário
 * 2 - Contar as palavras da frase e exibir o resultado
 * 3 - Solicitar se o usuário quer digitar outra frase
 * 4 - Se sim, repetir lógica 1 e 2
 * 5 - Se não, encerrar programa
 *
 */
public class ContadorPalavras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Escreva uma frase:");
            String frase = sc.nextLine();

            int contadorPalavras = frase.split(" ").length;
            System.out.println();
            System.out.println("Sua frase contém " + contadorPalavras + " palavras!");

            System.out.println("Quer digitar novamente?");
            String escolhaUsuario = sc.nextLine();

            if (escolhaUsuario.equalsIgnoreCase("n") || escolhaUsuario.equalsIgnoreCase("nn") || escolhaUsuario.equalsIgnoreCase("nao") || escolhaUsuario.equalsIgnoreCase("não") || escolhaUsuario.equalsIgnoreCase("no")) {
                repetir = false;
            }
        }

        System.out.println("Programa encerrado!");

        sc.close();
    }

}
