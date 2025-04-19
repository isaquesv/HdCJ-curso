package Secao006_POO.Anotacoes.Parte001;

import Secao006_POO.Anotacoes.Parte001.Exemplos001.Carro;
import Secao006_POO.Anotacoes.Parte001.Exemplos002.Pessoa;
import Secao006_POO.Anotacoes.Parte001.Exemplos003.ContaBancaria;
import Secao006_POO.Anotacoes.Parte001.Exemplos004.Produto;
import Secao006_POO.Anotacoes.Parte001.Exemplos005.Livro;

public class POO {

    public static void main(String[] args) {
        System.out.println("1 - Criação e instanciamento de classes");
        /*  Criar classe
            Exemplo 1: "Carro.java"

            Criando "Carro.java"
            Instanciando a classe
        */
        Carro fusca = new Carro();

        /*
            Acessando props e métodos, sintaxe:
            nomeObjeto.prop
            nomeObjeto.metodo()
        */
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;
        fusca.acelerar();
        fusca.mostrarInformacoes();

        // Outro exemplo
        Carro hilux = new Carro();
        hilux.marca = "Toyota";
        hilux.mostrarInformacoes();

        fusca.aumentarVelocidade(10);
        fusca.ligarMotor();
        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(20);
        fusca.aumentarVelocidade(30);

        System.out.println(fusca.estaLigado);
        System.out.println("---");
        System.out.println();

        System.out.println("2 - Criando propriedades");
        /*  Criando propriedades
            Exemplo 2: "Pessoa.java"
        */
        Pessoa estudante = new Pessoa();
        /*  estudante.name = "Isaque";
            Não é possível porque "name" é um atributo privado!
            Atributos/métodos privados podem ser chamados apenas pela classe onde são criados (Pessoa)
        */

        /*  Forma correta:
            chamar uma função da própria classe que seja responsável por definir este valor (setNome)
        */
        estudante.setNome("Isaque");
        estudante.setIdade(20);
        System.out.println("O nome do estudante é: " + estudante.getNome());
        System.out.println("A idade de " + estudante.getNome() + " é " + estudante.getIdade());
        System.out.println("---");
        System.out.println();

        System.out.println("3 - Setters");
        /*  Setters (set)
            Exemplo 3: "ContaBancaria.java"
        */
        ContaBancaria melissaContaBancaria = new ContaBancaria();
        melissaContaBancaria.setTitular("Melissa A.");
        melissaContaBancaria.setSaldo(-1000);
        melissaContaBancaria.setSaldo(10);
        melissaContaBancaria.exibirDetalhes();
        System.out.println(melissaContaBancaria.getTitular());
        System.out.println(melissaContaBancaria.getSaldo());
        System.out.println("---");
        System.out.println();

        System.out.println("4 - Lógica em GET e SET");
        /*  Lógica em GET e SET
            Exemplo 4: "Produto.java"
        */
        Produto bolo = new Produto();
        bolo.setNome("Bolo de Chocolocate");
        bolo.setPreco(29.55);
        System.out.println(bolo.getNome());
        System.out.println(bolo.getPreco());
        // Método dentro de método:
        bolo.exibirDetalhes();
        bolo.aplicarDesconto(-50);
        bolo.aplicarDesconto(50);
        bolo.exibirDetalhes();
        System.out.println("---");
        System.out.println();

        System.out.println("5 - Construtores");
        /*  Construtores
            Exemplo 5: "Livro.java"
        */
        Livro meuLivro = new Livro();
        meuLivro.exibirDetalhes();

        Livro outroLivro = new Livro("Título", "Java", 23.45);
        outroLivro.exibirDetalhes();
    }

}
