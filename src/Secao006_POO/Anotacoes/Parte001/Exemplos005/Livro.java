package Secao006_POO.Anotacoes.Parte001.Exemplos005;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    // fallback
    public Livro() {
        this.titulo = "Dom Quixote de La Mancha";
        this.autor = "Miguel de Cervantes";
        this.preco = 23.45;
    }

    // override
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }
}
