package Secao006_POO.Exercicios;

import Secao006_POO.Exercicios.Classes.*;

public class POO {

    public static void main(String[] args) {
        /*
            > Exercício 1: Criando uma Classe Celular

            Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria.
            Implemente os métodos para ligar e desligar o celular,
            e outro método que simule o consumo da bateria quando o celular é usado.
            Crie a classe principal para instanciar dois objetos Celular
            e testar os métodos criados.
        */
        Celular celular1 = new Celular();
        celular1.exibirDescricao();
        celular1.fazerLigacao(5);
        celular1.desligarCelular();
        celular1.ligarCelular();
        celular1.fazerLigacao(95);
        celular1.exibirDescricao();
        celular1.desligarCelular();

        System.out.println();

        Celular celular2 = new Celular("Apple", "iPhone 14 Pro", 50);
        celular2.exibirDescricao();
        celular2.fazerLigacao(5);
        celular2.desligarCelular();
        celular2.ligarCelular();
        celular2.fazerLigacao(95);
        celular2.fazerLigacao(45);
        celular2.exibirDescricao();
        celular2.desligarCelular();

        System.out.println("---");
        System.out.println();
        System.out.println();

        /*
            > Exercício 2: Classe Aluno com Encapsulamento e Construtores

            Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal.
            Adicione um construtor parametrizado para inicializar essas propriedades e
            implemente os setters e getters com validação para garantir
            que o nome não esteja vazio e a nota final esteja entre 0 e 100.
            Na classe principal, crie dois objetos da classe Aluno,
            atribua valores e exiba as informações.
        */
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Isaque Silva");
        estudante1.setMatricula(1);
        estudante1.setNotaFinal(100);
        estudante1.exibirDetalhes();

        Estudante estudante2 = new Estudante();
        estudante2.setNome(null);
        estudante2.setNome("");
        estudante2.setNome(" ");
        estudante2.setNome("Caio Nogueira");
        estudante2.setMatricula(-200);
        estudante2.setMatricula(0);
        estudante2.setMatricula(2);
        estudante2.setNotaFinal(100.99);
        estudante2.setNotaFinal(-100);
        estudante2.setNotaFinal(0.5);
        estudante2.exibirDetalhes();

        System.out.println("---");
        System.out.println();
        System.out.println();

        /*
            > Exercício 3: Classe ContaCorrente com Métodos e Encapsulamento

            Implemente uma classe ContaCorrente com as propriedades privadas titular, saldo e limiteSaque.
            Crie os métodos para depositar(), sacar() e exibirSaldo().
            O método de saque deve verificar se o valor é menor ou igual ao limite de saque
            e se o saldo é suficiente.
            Crie dois objetos da classe ContaCorrente e teste os métodos criados.
        */
        ContaCorrente titular1 = new ContaCorrente();
        titular1.setTitular("Joseffe");
        titular1.setSaldo(1_000_000.50);
        titular1.setLimiteSaque(200);
        titular1.depositar(-100);
        titular1.depositar(0.50);
        titular1.sacar(-200);
        titular1.sacar(0);
        titular1.sacar(300);
        titular1.sacar(150);

        System.out.println();

        ContaCorrente titular2 = new ContaCorrente();
        titular2.setTitular("Mr. Honey Badger");
        titular2.setSaldo(9_999_999.99);
        titular2.setLimiteSaque(1_000);
        titular2.depositar(-500);
        titular2.depositar(1_000_000);
        titular2.sacar(-100);
        titular2.sacar(0);
        titular2.sacar(2_000);
        titular2.sacar(999.99);

        System.out.println("---");
        System.out.println();
        System.out.println();

        /*
            > Exercício 4: Classe ProdutoEletronico com Método dentro de Método

            Crie uma classe ProdutoEletronico com as propriedades nome, preco, e garantia.
            Implemente um método para aplicar desconto no preço e, dentro desse método,
            chame outro método que calcula o valor do desconto.
            Crie um objeto da classe ProdutoEletronico, aplique o desconto
            e exiba as informações após a alteração do preço.
        */
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setNome("Smartphone Galaxy S23");
        produto.setPreco(3000.00);
        produto.setGarantiaEmMeses(12);
        produto.exibirDetalhes();
        produto.aplicarDescontos(10);
        produto.exibirDetalhes();

        System.out.println("---");
        System.out.println();
        System.out.println();

        /*
            > Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters

            Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor, e disponivel (boolean).
            Adicione métodos para pegar emprestado (definindo disponivel como false)
            e devolver o livro (definindo disponivel como true).
            Nos setters e getters, adicione a lógica para verificar se o livro está disponível
            ou já emprestado antes de permitir a ação.
            Na classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
        */

        LivroLivraria livro1 = new LivroLivraria();
        livro1.setTitulo("1984");
        livro1.setAutor("George Orwell");
        livro1.setDisponivel(true);
        livro1.devolverLivro();
        livro1.emprestarLivro();
        livro1.devolverLivro();

        LivroLivraria livro2 = new LivroLivraria();
        livro2.setTitulo("Harry Potter");
        livro2.setAutor("J.K. Rowling");
        livro2.setDisponivel(false);
        livro2.devolverLivro();
        livro2.emprestarLivro();
        livro2.devolverLivro();
    }

}
