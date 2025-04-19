package Secao006_POO.Anotacoes.Parte001.Exemplos003;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        // lógica para validar ou manipular:
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("O titular fornecido (" + titular + ") é inválido!");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo fornecido (" + saldo + ") precisa ser positivo!");
        }
    }

    public String getSaldo() {
        return "R$ " + saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
