package Secao006_POO.Anotacoes.Parte002.Exemplos002;

public class PessoaImutavel {

    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        // this.nome = "Teste"; Não é possível porque é um "final" (constante)
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //    public void setNome(String nome) {
    //        this.nome = nome;
    //    }
}
