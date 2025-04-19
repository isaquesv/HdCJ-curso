package Secao007_AvancandoEmPOO.Anotacoes.Classes007;

public class TransferenciaBancaria implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via transferência bancária.\n", valor);
    }

    @Override
    public void exibirRecibo(double valor) {
        System.out.printf("O valor de R$ %.2f foi transferido para o banco!\n", valor);
    }

}
