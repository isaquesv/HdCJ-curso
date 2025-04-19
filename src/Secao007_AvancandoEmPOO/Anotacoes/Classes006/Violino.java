package Secao007_AvancandoEmPOO.Anotacoes.Classes006;

public class Violino extends InstrumentoMusical {

    public Violino(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Agora estamos tocando o " + nome);
    }

}
