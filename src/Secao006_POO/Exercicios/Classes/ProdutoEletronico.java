package Secao006_POO.Exercicios.Classes;

public class ProdutoEletronico {

    private String nome;
    private double preco;
    private int garantiaEmMeses;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public void aplicarDescontos(int porcentagem) {
        double desconto = calcularDesconto(getPreco(), porcentagem);
        double novoPreco = this.preco - desconto;

        setPreco(novoPreco);
    }

    public double calcularDesconto(double preco, int porcentagem) {
        return (preco * porcentagem) / 100;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Garantia: " + getGarantiaEmMeses() + " meses");
    }
}
