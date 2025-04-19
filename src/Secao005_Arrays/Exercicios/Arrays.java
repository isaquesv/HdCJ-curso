package Secao005_Arrays.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercício 1: Inverter Elementos de um Array");
        exercicio01(sc);
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 2: Encontrar o Elemento Mais Frequente em um Array");
        exercicio02();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 3: Transpor uma Matriz 2D");
        exercicio03();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 4: Substituir Valores em um Array com Condição");
        exercicio04();
        System.out.println("---");
        System.out.println();

        System.out.println("Exercício 5: Remover Elementos Duplicados de um Array");
        exercicio05();

        sc.close();
    }

    public static void exercicio01(Scanner sc) {
        /*
             > Exercício 1: Inverter Elementos de um Array

             Crie um programa que receba um array de inteiros do usuário
             e inverta a ordem dos elementos.
             Exiba o array original e o array invertido.

             [1, 2, 3]
             [3, 2, 1]
        */

        System.out.println("Qual o tamanho de sua lista?");
        int tamanhoArray = sc.nextInt();
        int[] array = new int[tamanhoArray];
        int[] yarra = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Insira um número inteiro:");
            array[i] = sc.nextInt();
            yarra[tamanhoArray - (i + 1)] = array[i];
        }

        System.out.println("Array original: " + java.util.Arrays.toString(array));
        System.out.println("Array invertido: " + java.util.Arrays.toString(yarra));
        System.out.println();
    }

    public static void exercicio02() {
        /*
             > Exercício 2: Encontrar o Elemento Mais Frequente em um Array

             Desenvolva um programa que receba um array de inteiros
             e determine qual elemento aparece com maior frequência.
             Caso haja empate, exiba todos os elementos empatados.
        */

        int[] numeros = {1, 1, 2, 2, 3, 1, 4, 5};
        int[] valores = new int[numeros.length];
        int[] frequencias = new int[numeros.length];
        int tamanho = 0;

        // Contando as frequências
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            boolean encontrado = false;

            for (int j = 0; j < tamanho; j++) {
                if (valores[j] == numero) {
                    frequencias[j]++;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                valores[tamanho] = numero;
                frequencias[tamanho] = 1;
                tamanho++;
            }
        }

        // Encontrar a maior frequência
        int contadorFrequencia = 0;
        for (int i = 0; i < tamanho; i++) {
            if (frequencias[i] > contadorFrequencia) {
                contadorFrequencia = frequencias[i];
            }
        }

        // Mostrar os elementos com maior frequência
        System.out.print("Elemento(s) mais frequente(s): ");
        for (int i = 0; i < tamanho; i++) {
            if (frequencias[i] == contadorFrequencia) {
                System.out.print(valores[i] + " ");
            }
        }

        System.out.println("Frequência: " + contadorFrequencia + " ocorrência(s)");
        System.out.println();
    }

    public static void exercicio03() {
        /*
             > Exercício 3: Transpor uma Matriz 2D

             Crie um programa que receba uma matriz 2D
             e crie a matriz transposta (troca de linhas por colunas).
             Exiba a matriz original e a matriz transposta.
        */

        int[][] matriz = {
                {1, 2},
                {3, 4}
        };

        int[][] zirtam = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                zirtam[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz original:");
        for (int[] linha : matriz) {
            System.out.println(java.util.Arrays.toString(linha));
        }

        System.out.println();

        System.out.println("Matriz transporta:");
        for (int[] linha : zirtam) {
            System.out.println(java.util.Arrays.toString(linha));
        }

        System.out.println();
    }

    public static void exercicio04() {
        /*
             > Exercício 4: Substituir Valores em um Array com Condição

             Escreva um programa que receba um array de inteiros
             e substitua todos os valores negativos por zero.
             Exiba o array antes e depois da modificação.

             // [ -1, 2 , 3]
             // [0, 2, 3]
        */

        int[] numeros = {-1, 2 , 3};
        System.out.println("Array antes da modificação: " + java.util.Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("Array depois da modificação: " + java.util.Arrays.toString(numeros));
        System.out.println();
    }

    public static void exercicio05() {
        /*
             > Exercício 5: Remover Elementos Duplicados de um Array

             Desenvolva um programa que remova os elementos duplicados de um array de inteiros,
             mantendo apenas a primeira ocorrência de cada valor.
             Exiba o array original e o array sem duplicatas.

             [1, 1, 2, 2, 3]
             [1, 2, 3]
        */

        int[] numeros = {1, 1, 2, 2, 3};
        ArrayList<Integer> soremun = new ArrayList<>();
        boolean duplicado = false;
        int k = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < soremun.size(); j++) {
                if (numeros[i] == soremun.get(j)) {
                    duplicado = true;
                }
            }

            if (!duplicado) {
                soremun.add(numeros[i]);
                k++;
            }

            duplicado = false;
        }

        System.out.println(java.util.Arrays.toString(numeros));
        System.out.println(soremun);
    }
}
