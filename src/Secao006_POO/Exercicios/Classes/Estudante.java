package Secao006_POO.Exercicios.Classes;

public class Estudante {

    private String nome;
    private int matricula;
    private double notaFinal;

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome informado (" + nome + ") é inválido!");
        }
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("A matricula informada (" + matricula + ") deve ser maior que 0!");
        }
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("A nota final informada (" + notaFinal + ") deve estar entre 0 e 100!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNotaFinal() {
        return notaFinal + "/100";
    }

    public void exibirDetalhes() {
        System.out.println("Nome do estudante: " + getNome());
        System.out.println("Matricula do estudante: " + getMatricula());
        System.out.println("Nota final do estudante: " + getNotaFinal());
        System.out.println("---");
    }

}
