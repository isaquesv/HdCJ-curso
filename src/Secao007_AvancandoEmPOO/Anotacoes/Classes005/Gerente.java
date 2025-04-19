package Secao007_AvancandoEmPOO.Anotacoes.Classes005;

public class Gerente extends Funcionario {

    private double bonusAdicional;

    public Gerente(String nome, double salario, double bonusAdicional) {
        // Super porque esses atributos estão presentes na classe Funcionario
        super(nome, salario);

        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public double calcularBonus() {
        // com o super é possível chamar os métodos da classe pai (funcionário)
        return super.calcularBonus() + bonusAdicional;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bonus adicional do gerente: " + bonusAdicional);
    }

}
