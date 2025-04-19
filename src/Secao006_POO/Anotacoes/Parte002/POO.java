package Secao006_POO.Anotacoes.Parte002;

import Secao006_POO.Anotacoes.Parte002.Exemplos003.Turma;
import Secao006_POO.Anotacoes.Parte002.Exemplos001.Funcionario;
import Secao006_POO.Anotacoes.Parte002.Exemplos002.PessoaImutavel;

import java.util.Arrays;

public class POO {

    public static void main(String[] args) {
        /*  Níveis de acesso:
            Public: o membro pode ser acessado de qualquer lugar
            Private: o membro só poder ser acessado pela própria classe
            Protected: o membro pode ser acessado dentro da classe, suas subclasses e classes do mesmo pacote

            Exemplo 1: "Funcionario.java"
        */
        Funcionario funcionario001 = new Funcionario("Joseffe", 10_000.99, "coxinha123");
        funcionario001.exibirDetalhes();

        funcionario001.nome = "Josephe";
        // funcionario001.salario = 15_000.50; Não é possível porque é "protected"
        // employee001.password = "coxinha1234"; Não é possível porque é "private"
        funcionario001.exibirDetalhes();

        funcionario001.aumentarSalario(10);
        // System.out.println(employee001.verifyPassword("coxinha123"));
        if (funcionario001.autenticar("coxinha123")) {
            System.out.println("O usuário entrou no sistema!");
        } else {
            System.out.println("Senha incorreta!");
        }


        /*  Classe imutável
            Exemplo 2: "PessoaImutavel.java"
        */
        PessoaImutavel Joaquin = new PessoaImutavel("Joaquin", 23);
        System.out.println("Nome: " + Joaquin.getNome());
        System.out.println("Idade: " + Joaquin.getIdade());
        // Joaquin.name = "Jo"; Não é possível por ser um "final" (constante)


        /*  Encapsulamento de arrays
            Exemplo 3: "Turma.java"
        */
        String[] estudantes = {"Isaque", "Silva", "Venancio"};
        Turma novaTurma = new Turma(estudantes);
        System.out.println(Arrays.toString(novaTurma.getEstudantes()));

        String[] novosEstudantes = {"Ruan", "Fernandes", "Mendonça"};
        novaTurma.setEstudantes(novosEstudantes);
    }

}
