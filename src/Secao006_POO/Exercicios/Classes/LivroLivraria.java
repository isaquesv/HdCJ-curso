package Secao006_POO.Exercicios.Classes;

public class LivroLivraria {

    private String titulo;
    private String autor;
    private boolean estaDisponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean estaDisponivel() {
        return estaDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        estaDisponivel = disponivel;
    }

    public void emprestarLivro() {
        if (estaDisponivel) {
            setDisponivel(false);
            System.out.println("O livro " + getTitulo() + " foi emprestado com sucesso!");
        } else {
            System.out.println("Não é possível emprestar o livro " + getTitulo() + " porque ele não esta disponível!");
        }
    }

    public void devolverLivro() {
        if (estaDisponivel) {
            System.out.println("O livro " + getTitulo() + " não pode ser devolvido porque ele não foi emprestado!");
        } else {
            setDisponivel(true);
            System.out.println("O livro " + getTitulo() + " foi devolvido com sucesso!");
        }
    }
}
