package Secao006_POO.Projetos;

import java.util.Scanner;

/*
 Criando o Sistema de Cadastro de Alunos

 > 1 - Criar a Classe Aluno:

 Crie a classe Aluno que irá representar cada aluno do sistema.
 Declare os atributos privados: nome, matricula (do tipo String)
 e notas (um array de double).

 > 2 - Criar o Construtor da Classe Aluno:

 Defina um construtor que receba o nome, a matrícula
 e o número de notas que o aluno terá.
 Dentro do construtor, inicialize o array notas com o tamanho recebido.

 > 3 - Método para Adicionar Notas:

 Crie o método adicionarNotas(Scanner scanner) na classe Aluno.
 Dentro desse método, peça ao usuário para digitar as notas uma a uma e
 armazene cada nota no array notas.

 > 4 - Método para Calcular a Média:

 Implemente o método calcularMedia(),
 que deve somar todas as notas do array notas e dividir pelo número de notas.
 Retorne a média calculada.

 > 5 - Método para Exibir o Resultado:

 Crie o método exibirResultado() que:
 Exiba o nome do aluno, a matrícula e a média final calculada.
 Verifique se o aluno foi aprovado ou reprovado com base na média.
 (Aprovado se média >= 6.0).

 > 6 - Criar a Classe SistemaCadastroAlunos:

 Crie a classe principal SistemaCadastroAlunos.
 No método main(), use um Scanner para coletar o número de alunos que o usuário deseja cadastrar.

 > 7 - Cadastrar os Alunos:

 Dentro de um loop for, peça ao usuário o nome, a matrícula
 e o número de notas para cada aluno.
 Para cada aluno, crie um novo objeto Aluno e armazene no array alunos[].
 Use o método adicionarNotas() para permitir que o usuário insira
 as notas para cada aluno.

 > 8 - Calcular e Exibir Resultados:

 Após cadastrar todos os alunos, crie um loop para percorrer o array de alunos.
 Para cada aluno, chame o método exibirResultado() para calcular
 e exibir a média e o status (aprovado ou reprovado).

 > 9 - Fechar o Scanner:

 Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.

 */
public class CadastroAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastrados?");
        int quantidadeEstudantes = sc.nextInt();

        System.out.println("Quantas notas, para cada aluno, serão registradas?");
        int quantidadeNotas = sc.nextInt();

        sc.nextLine();

        Estudante[] estudantes = new Estudante[quantidadeEstudantes];

        for (int i = 0; i < quantidadeEstudantes; i++) {
            System.out.println("Qual o nome do " + (i+1) + "º estudante?");
            String nomeEstudante = sc.nextLine();

            System.out.println("Qual a matricula do " + (i+1) + "º estudante?");
            String matriculaEstudante = sc.nextLine();

            Estudante SistemaCadastroAlunos = new Estudante(nomeEstudante, matriculaEstudante, quantidadeNotas);
            System.out.println("Agora vamos inserir as notas de " + nomeEstudante + "!");

            SistemaCadastroAlunos.adicionarNotas(sc);
            estudantes[i] = SistemaCadastroAlunos;

            sc.nextLine();

            System.out.println();
        }

        for (Estudante estudante : estudantes) {
            estudante.exibirResultado();
        }

        sc.close();
    }

}
