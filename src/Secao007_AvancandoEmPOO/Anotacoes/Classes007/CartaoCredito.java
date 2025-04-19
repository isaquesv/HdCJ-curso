package Secao007_AvancandoEmPOO.Anotacoes.Classes007;

public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via cartão de crédito.\n", valor);
    }

}
