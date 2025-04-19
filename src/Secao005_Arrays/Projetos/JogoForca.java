package Secao005_Arrays.Projetos;

import java.util.Arrays;
import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {
        /*
            1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

            2 - Definir Palavra Secreta: Criar uma variável palavraSecreta
            com a palavra a ser adivinhada e inicializar um array palavraOculta
            com caracteres de sublinhado _ para representar a palavra oculta.

            3 -Configurar Tentativas: Definir o número máximo de tentativas
            e uma variável para verificar se o usuário venceu.

            4 - Loop Principal: Criar um loop que continua enquanto houver tentativas restantes.

            5 - Exibir Status: Mostrar a palavra oculta e o número de tentativas restantes.
            Solicitar a entrada do usuário para uma letra.

            6 - Verificar Letra: Comparar a letra inserida com a palavra secreta.
            Atualizar a palavra oculta se a letra for correta.
            Diminuir o número de tentativas se a letra for incorreta.

            7 - Verificar Vitória: Verificar se a palavra oculta corresponde à palavra secreta
            e sair do loop se o usuário vencer.

            8 -Finalizar Jogo: Exibir mensagem de vitória ou derrota e mostrar a palavra secreta.

            9 -Fechar Scanner: Fechar o Scanner para liberar recursos.
        */

        Scanner sc = new Scanner(System.in);

        String palavraSecreta = "sardinha";
        String[] arrayPalavraSecreta = {"_", "_", "_", "_", "_", "_", "_", "_"};

        int limiteTentativas = palavraSecreta.length();
        boolean vitoria = false;

        int contadorTentativas = 1;
        int i = 0;

        while (contadorTentativas <= limiteTentativas) {
            System.out.println("Palavra secreta: " + Arrays.toString(arrayPalavraSecreta));
            System.out.println("Insira uma letra:");
            String userLetter = sc.next();

            if (userLetter.length() != 1) {
                System.out.println("Você deve inserir uma letra de cada vez!");
                System.exit(0);
            }

            String currentCharSecretWord = String.valueOf(palavraSecreta.charAt(i));
            if (currentCharSecretWord.equalsIgnoreCase(userLetter)) {
                arrayPalavraSecreta[i] = currentCharSecretWord;
                i++;

                if (i == limiteTentativas) {
                    vitoria = true;
                    break;
                } else {
                    System.out.println("Certo! Continue assim, você esta indo bem!");
                }
            } else {
                contadorTentativas++;

                System.out.println("Errado!");

                if (contadorTentativas <= 8) {
                    System.out.println("Você ainda tem " + (limiteTentativas - contadorTentativas + 1) + " tentativa(s)!");
                }
            }
        }

        String mensagem = (vitoria) ? "Vitória!": "Derrota!";

        System.out.println();
        System.out.println(mensagem);


        System.out.println("A palavra secreta é: " + palavraSecreta);
        System.out.println("Número de tentativas: " + (contadorTentativas - 1));

        sc.close();
    }

}
