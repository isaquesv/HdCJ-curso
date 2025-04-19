package Secao004_EstruturasRepeticao.Anotacoes;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        /*  FOR - Ideal quando sabemos o número exato de iterações
            loop que vai rodar de 1 a 5
        */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // ou
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        /*  Variáveis de inicialização = i, j, k (int i = 0)
            Condição = determina até quando ou quantas vezes o loop vai rodar (enquanto i < 5)
            Incremento / Decremento = a variável vai chegar na condição (a cada loop incrementa 1 em i (i++))
        */

        // Mostrando cada caractere de uma palavra
        String palavra = "Java";
        // A primeira posição de um array sempre é 0
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println("Caractere: " + palavra.charAt(i));
        }


        // WHILE - Executa um bloco de código repetidamente enquanto uma condição específica for verdadeira
        int i = 0;
        while (i < 5) { // Enquanto i for menor que 5
            System.out.println(i); // Exibe o valor de i
            i++; // Incrementa 1 no i
        }

        int valor = 0;
        while (valor != 7) {
            valor = (int) (Math.random() * 10);
            System.out.println("Número aleatório: " + valor);
        }


        // DO WHILE -
        int j = 5;
        do {
            if (j == 3) {
                break;
            }

            System.out.println("O valor de j é " + j);
            j--;
        } while (j > 0);
    }

}
