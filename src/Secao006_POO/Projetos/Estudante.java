package Secao006_POO.Projetos;

import java.util.Scanner;

public class Estudante {

    private String nome;
    private String matricula;
    private double[] notas;

    public Estudante(String nome, String matricula, int quantidadeDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[quantidadeDeNotas];
    }

    public void adicionarNotas(Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira uma nota:");
            notas[i] = sc.nextDouble();
        }
    }

    public double calcularMedia() {
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media / notas.length;
    }

    public void exibirResultado() {
        double mediaFinal = calcularMedia();

        System.out.println("Nome do estudante: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.printf("Média final: %.2f\n", mediaFinal);

        if (mediaFinal >= 6) {
            System.out.println("Parabéns " + this.nome + "! Você foi aprovado(a)!");
        } else {
            System.out.println("Não foi dessa vez " + this.nome + ". Infelizmente, você foi reprovado(a).");
        }

        System.out.println("---");
    }

}
