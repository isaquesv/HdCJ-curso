package Secao001_Variaveis.Projetos;

import java.util.Scanner;

// Projeto tabuada
// Receber um número pelo scanner, exibir a tabuada do mesmo
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você deseja ver a tabuada de qual número?");
        int numero = sc.nextInt();

        System.out.println("Até qual número sua tabuada deve ir?");
        int maximo = sc.nextInt();

        System.out.println();
        System.out.println("Tabuada do número " + numero + " até o número " + maximo);
        for (int i = 0; i <= maximo; i++) {
            int multiplication = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplication);
        }

        sc.close();
    }

}
