package Secao007_AvancandoEmPOO.Anotacoes.Classes003;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Override - Sobreescrita
    // NÃO É UMA BOA PRÁTICA FAZER SOBREESCRITA DE MÉTODOS DO PRÓPRIO JAVA
    @Override
    public String toString() {
        return "Nome: " + nome + " - Idade: " + idade;
    }
}
