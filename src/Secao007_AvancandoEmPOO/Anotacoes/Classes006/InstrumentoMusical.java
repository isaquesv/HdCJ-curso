package Secao007_AvancandoEmPOO.Anotacoes.Classes006;

public abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // Métodos abstratos: Tem que ser implementado na subclasse
    public abstract void tocar();

    // Métodos concretos: São herdados pelas subclasses
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
}
