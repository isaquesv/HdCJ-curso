package Secao002_Condicionais.Projetos;

import java.util.Scanner;

// 1 - Pedir peso em kg
// 2 - Pedir altura em m
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => Abaixo do peso
// >= 18.5 e <= 24.9 => Peso normal
// >= 25 e < 29.9 => Sobrepeso
// Mais que isso: obesidade
public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o peso em KG:");
        double peso = sc.nextDouble();

        System.out.println("Insira a altura em M:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println();

        String classificacaoImc;

        if (imc < 18.5) {
            classificacaoImc = "Abaixo do peso (menor que 18,5).";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacaoImc = "Peso normal (entre 18,5 e 24,9).";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacaoImc = "Sobrepeso (entre 25 e 29,9).";
        } else {
            classificacaoImc = "Obesidade (maior que 29,9).";
        }

        System.out.printf("O IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacaoImc);

        sc.close();
    }

}
