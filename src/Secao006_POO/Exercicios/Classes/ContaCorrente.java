package Secao006_POO.Exercicios.Classes;

public class ContaCorrente {

    private String titular;
    private double saldo;
    private double limiteSaque;

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("O títular informado (" + titular + ") não é válido!");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public String getTitular() {
        return titular;
    }

    public String getSaldo() {
        return String.format("R$ %.2f", saldo);
    }

    public String getLimiteSaque() {
        return String.format("R$ %.2f", limiteSaque);
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;

            System.out.printf("O deposito de R$ %.2f foi realizado com sucesso!\n", quantia);
            System.out.println("Saldo atual: " + getSaldo());
        } else {
            System.out.println("A quantia depositada deve ser maior que 0!");
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0) {
            if (quantia <= this.limiteSaque) {
                if (quantia <= this.saldo) {
                    this.saldo -= quantia;

                    System.out.printf("O saque de R$ %.2f foi realizado com sucesso!\n", quantia);
                    System.out.println("Saldo atual: " + getSaldo());
                } else {
                    System.out.printf("Saldo insuficiente para sacar R$ %.2f", quantia);
                }
            } else {
                System.out.printf("O limite de R$ %.2f não permitiu completar o saque de R$ %.2f%n", this.limiteSaque, quantia);
            }
        } else {
            System.out.println("A quantia solicitada deve ser maior que 0!");
        }
    }
}
