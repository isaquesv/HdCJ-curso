package Secao002_Condicionais.Projetos;

import java.util.Scanner;

// Ter três produtos catalogados => Nome
// Pedir o nome do produto => Novo ou de um ja existente
// Verificar se o produto está catalogado
// Se sim, podemos escolher alterar o preço ou não
//  Se alterar o preco, exibir classificação (Abaixo)
//  Se não alterar, Encerrar programa
// Se não, pedir o preço do produto
// Exibir classificação
// Classificações: preco < 50 = barato, 50 a 100 = moderado, maior que 100 = caro
// Exibir no fim nome do produto e preço
public class ClassificacaoProduto {

    public static void main(String[] args) {
        String[] produtosCatalogados = {"Laranja", "Limão", "Uva"};
        double[] precosCatalogados = {1.50, 1.75, 2};

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista de produtos catalogados:");
        for (int i = 0; i < produtosCatalogados.length; i++) {
            System.out.printf("Produto: %s | Preço: R$ %.2f\n", produtosCatalogados[i], precosCatalogados[i]);
        }
        System.out.println();

        System.out.println("Insira o nome de um produto:");
        String produtoSelecionado = sc.nextLine();
        boolean produtoEstaCatalogado = false;

        for (int i = 0; i < produtosCatalogados.length; i++) {
            if (produtosCatalogados[i].equalsIgnoreCase(produtoSelecionado)) {
                System.out.println("Quer alterar o preço do produto " + produtosCatalogados[i] + "?");
                String escolhaUsuario = sc.nextLine();

                if (escolhaUsuario.equalsIgnoreCase("s") || escolhaUsuario.equalsIgnoreCase("ss") || escolhaUsuario.equalsIgnoreCase("sim") || escolhaUsuario.equalsIgnoreCase("y") || escolhaUsuario.equalsIgnoreCase("yes") || escolhaUsuario.equalsIgnoreCase("true") || escolhaUsuario.equalsIgnoreCase("ok")) {
                    System.out.println("Qual o novo preço do produto " + produtosCatalogados[i] + "?");
                    double novoPreco = sc.nextDouble();

                    precosCatalogados[i] = novoPreco;
                } else {
                    System.out.println("Programa encerrado!");
                }

                produtoEstaCatalogado = true;
                System.out.println();
                break;
            }
        }

        if (!produtoEstaCatalogado) {
            System.out.println("Qual o preço do produto " + produtoSelecionado + "?");
            double precoProdutoNovo = sc.nextDouble();

            System.out.println();
            System.out.printf("Produto: %s | Preço R$ %.2f\n", produtoSelecionado, precoProdutoNovo);
            if (precoProdutoNovo < 50) {
                System.out.println("Classificação: Barato");
            } else if (precoProdutoNovo >= 50 && precoProdutoNovo <= 100) {
                System.out.println("Classificação: Moderado");
            } else {
                System.out.println("Classificação: Caro");
            }

            System.out.println();
        }

        System.out.println("Lista de produtos catalogados:");
        for (int i = 0; i < produtosCatalogados.length; i++) {
            System.out.printf("Produto: %s | Preço: R$ %.2f\n", produtosCatalogados[i], precosCatalogados[i]);
        }

        sc.close();
    }

}
