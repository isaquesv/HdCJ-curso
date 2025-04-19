package Secao001_Variaveis.Anotacoes;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {
        /*  O que são variáveis?
            tipo -> nomeVariavel -> atribuir valor;
        */
        String nome = "Isaque";

        // nome => "Isaque"
        System.out.println(nome);

        /*  Tipos de dados
            DADOS PRIMITIVOS:
        */
        boolean estaLigado = true;
        boolean estaDesligado = false;

        byte exemploByte = -128; // mínimo
        byte outroExemploByte = 127; // máximo

        short exemploShort = -32768;
        short outroExemploShort = 32767;

        int exemploInt = -2147483648;
        int outroInt = 2147483647;

        long exemploLong = -9223372036854775808L;
        long outroLong = 9223372036854775807L;

        float exemploFloat = 12.54f;
        // float outroFloat = 12.54; precisa do "f" no final

        double exemploDouble = 12.54;
        double outroDouble = 12.54d; // poder ter o "d", ou não, no final

        char exemploChar = 'A';
        char outroChar = 65; // código ASCII para 'A'

        /*  Strings são sequências de caracteres usadas para armazenar e manipular texto
            Classe String: em Java, as Strings são objetos da classe String e oferecem métodos
            para manipular textos
        */

        // Atribuição de variável com outra
        String teste = "Olá";
        String testeTeste = teste;
        System.out.println(testeTeste);

        // OPERADORES ARITMÉTICOS
        short soma = 1 + 2; // 3
        short subtracao = 1 - 2; // -1
        short multiplicacao = 3 * 3; // 9
        short divisao = 6 / 3; // 2
        short modulo = 6 % 3; // 0 (resto da divisão)

        // OUTROS OPERADORES
        short i = 0;
        i++; // i = 1 (Incremento ++)
        short j = 0;
        j--; // j = -1 (Decremento --)
        short k = 3;
        k += 2; // k = 5 (Atribuição aditiva)
        short l = 2;
        l -= 2; // l = 0 (Atribuição subtrativa)

        // TYPE CASTING
        short maisUmExemploShort = 42;
        int maisUmExemploInt = maisUmExemploShort;
        float maisUmExemploFloat = maisUmExemploInt;
        System.out.println(maisUmExemploFloat);

        // CONSTANTES
        final int DIAS_SEMANA = 7;
        System.out.println("A semana sempre terá " + DIAS_SEMANA + " dias!");

        // VAR
        var outraString = "Olá!";
        System.out.println(outraString);

        // INTERAÇÃO COM O USUÁRIO VIA TERMINAL (Classe Scanner)
        Scanner sc = new Scanner(System.in);

        // Mensagem exibida para o usuário:
        System.out.println("Qual o seu nome?");
        // Armazenando o valor digitado pelo usuário
        String outroNome = sc.nextLine();
        System.out.println("Olá " + outroNome + ", como vai?");

        sc.close();
    }

}