package Secao006_POO.Anotacoes.Parte001.Exemplos004;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty() && nome.length() > 3) {
            this.nome = nome;
        } else {
            System.out.println("O nome fornecido (" + nome + ") não atende aos critérios!");
        }
    }

    public void setPreco(double price) {
        if (price > 0) {
            this.preco = price;
        } else {
            System.out.println("O preço fornecido (" + preco + ") deve ser positivo!");
        }
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getPreco() {
        return String.format("R$%.2f", preco);
    }

    public void exibirDetalhes() {
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço do produto: " + getPreco());
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            double desconto = calcularDesconto(porcentagem);
            this.preco -= desconto;

            System.out.printf("Desconto de %.2f aplicado!", desconto);
            exibirDetalhes();
        } else {
            System.out.println("Porcentagem inválida!");
        }
    }

    public double calcularDesconto(double porcentagem) {
        return (preco * porcentagem) / 100;
    }
}
