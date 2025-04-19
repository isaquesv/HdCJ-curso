package Secao005_Arrays.Anotacoes;

import java.util.Comparator;

public class Arrays {

    public static void main(String[] args) {
        /*  Arrays
            tipo[] nomeArray = new tipo[tamanho];
            tipo[] nomeArray = {1, 2, 3};
        */
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Primeiro elemento do array: " + numeros[0]);

        // Array vazio de tamanho fixo
        String[] frutas = new String[3];
        // Adicionando valores no array
        frutas[0] = "Maçã";
        frutas[1] = "Laranja";
        frutas[2] = "Mamão";

        double[] precos = {3.75, 5.55, 9.99};
        // Alterando valores do array
        precos[1] = 5.75;

        /*  Loops em arrays
            Somar todos os valores de um array
            acessar os elementos e condensar a soma deles em uma variável
        */
        int soma = 0;

        // For - utilizando quando não é necessário percorrer todos os elmentos do array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos do array: " + soma);

        // For each - utilizado quando é necessário percorrer TODOS os elementos do array
        for (String fruta : frutas) {
            System.out.println("A fruta da vez é: " + fruta);
        }


        /*  Método toString()
            Classes no Java, que vão ter métodos utilitários, o Arrays é uma delas
        */
        String dadosNumeros = java.util.Arrays.toString(numeros);
        String dadosFrutas = java.util.Arrays.toString(frutas);

        System.out.println(dadosNumeros);
        System.out.println(dadosFrutas);


        /*  Matrizes
            array[0][1]
        */
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matriz[0][1]);

        // Criando array 2d vazio e preenchendo
        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        System.out.println(java.util.Arrays.toString(tabela));

        for (int[] linha : tabela) {
            System.out.println(java.util.Arrays.toString(linha));
        }

        int[][] notas = new int[4][5];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = i * j;
            }
        }

        for (int[] linha : notas) {
            System.out.println(java.util.Arrays.toString(linha));
        }

        // Ordenação
        // Ordenação de array de inteiros
        int[] outrosNumeros = {1, 5, 6, 9, 2, 3, 4, 2, 0, 10, 6, 8};
        java.util.Arrays.sort(outrosNumeros);
        System.out.println(java.util.Arrays.toString(outrosNumeros));

        // Ordenação por comparador
        String[] nomes = {"Ruan", "Isaque", "Luiza", "Karlo", "Douglas"};
        java.util.Arrays.sort(nomes, Comparator.reverseOrder());
        System.out.println(java.util.Arrays.toString(nomes));
        java.util.Arrays.sort(nomes, Comparator.naturalOrder());
        System.out.println(java.util.Arrays.toString(nomes));

        // Ordenação de matriz
        int[][] outraMatriz = {
                {4, 9, 1},
                {3, 8, 5},
                {2, 1, 3}
        };

        // Ordenação de linhas, por um valor de coluna
        java.util.Arrays.sort(outraMatriz, Comparator.comparingInt(a -> a[1]));
        for (int[] linha : outraMatriz) {
            System.out.println(java.util.Arrays.toString(linha));
        }

        // Exibir matriz sem for each
        System.out.println(java.util.Arrays.deepToString(outraMatriz));
    }

}
