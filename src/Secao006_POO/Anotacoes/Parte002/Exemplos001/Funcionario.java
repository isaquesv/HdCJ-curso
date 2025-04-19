package Secao006_POO.Anotacoes.Parte002.Exemplos001;

public class Funcionario {

    public String nome;
    protected double salario;
    private String senha;

    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += (salario * porcentagem) / 100;

        System.out.printf("O salário atual é de: R$ %.2f\n", salario);
    }

    private boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    public boolean autenticar(String senhaDigitada) {
        // Outras lógicas
        return verificarSenha(senhaDigitada);
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$%.2f\n", salario);
        System.out.println("Senha: " + senha);
    }

}
