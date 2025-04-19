package Secao006_POO.Anotacoes.Parte001.Exemplos002;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        // THIS -> objeto
        // this = este objeto
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
