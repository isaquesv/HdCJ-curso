package Secao001_Variaveis.Projetos;

import java.util.Scanner;

// Obter nome do aluno e 3 notas
// Exibir mensagem com nome e média final
// Bônus: Se a nota for maior ou igual a 7, imprimir Aprovado, se não: Reprovado
public class MediaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do(a) aluno(a):");
        String nome = sc.nextLine();
        double mediaFinal = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira a " + i + "ª nota:");
            mediaFinal += sc.nextDouble();
        }

        mediaFinal /= 3;

        System.out.println();
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("Média final: " + mediaFinal);

        if (mediaFinal >= 7) {
            System.out.println("Status: Aprovado(a)!");
        } else {
            System.out.println("Status: Reprovado(a).");
        }

        sc.close();
    }

}
