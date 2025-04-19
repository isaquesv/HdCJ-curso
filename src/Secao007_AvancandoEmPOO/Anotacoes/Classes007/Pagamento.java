package Secao007_AvancandoEmPOO.Anotacoes.Classes007;

public interface Pagamento {

    // Método abstrato -- é necessário implementa-los e sobrescreve-los nas classes que o chamam
    void processarPagamento(double valor);

    // Método com default -- não é necessário implementa-los sobrescreve-los nas classes que o chamam
    default void exibirRecibo(double valor) {
        System.out.printf("Recibo do pagamento com valor de R$ %.2f\n", valor);
    }
}
