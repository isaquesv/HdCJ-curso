package Secao003_Funcoes.Anotacoes;

public class Funcoes {
    public static void main(String[] args) {
        // Criando a primeira função
        saudacao();

        /*  Funções "built in" de String
            Built in -> funções que já vem com a classe
        */
        String frase = "Java é muito bom!";

        System.out.println(frase.length()); // tamanho
        System.out.println(frase.substring(0, 4)); // dividir String
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.replace("Java", "SQL")); // substituir trecho

        // Funções Math
        System.out.println(Math.sqrt(9)); // raiz quadrada
        System.out.println(Math.pow(2, 4)); // potenciação
        System.out.println(Math.abs(-5)); // conversão para absoluto
        System.out.println(Math.abs(8));
        System.out.println(Math.max(1, 100)); // pegar o maior número
    }

    /*  Nível de acesso, STATIC => não preciso instanciar classe para executar
        Nome, os parenteses (args / parâmetros), bloco {}
    */
    public static void saudacao() {

        System.out.println("Olá, esta é a minha primeira função!");

    }
}