package Secao007_AvancandoEmPOO.Anotacoes.Classes006;

// Não temos uma herança propriamente dita
public class Violao extends InstrumentoMusical {

    public Violao(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando nas cordas do " + nome);
    }

}
