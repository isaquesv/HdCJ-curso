package Secao007_AvancandoEmPOO.Anotacoes;

import Secao007_AvancandoEmPOO.Anotacoes.Classes001.Carro;
import Secao007_AvancandoEmPOO.Anotacoes.Classes001.Motor;
import Secao007_AvancandoEmPOO.Anotacoes.Classes002.Animal;
import Secao007_AvancandoEmPOO.Anotacoes.Classes002.Cachorro;
import Secao007_AvancandoEmPOO.Anotacoes.Classes003.Pessoa;
import Secao007_AvancandoEmPOO.Anotacoes.Classes004.Circulo;
import Secao007_AvancandoEmPOO.Anotacoes.Classes004.Quadrado;
import Secao007_AvancandoEmPOO.Anotacoes.Classes005.Funcionario;
import Secao007_AvancandoEmPOO.Anotacoes.Classes005.Gerente;
import Secao007_AvancandoEmPOO.Anotacoes.Classes006.Bateria;
import Secao007_AvancandoEmPOO.Anotacoes.Classes006.InstrumentoMusical;
import Secao007_AvancandoEmPOO.Anotacoes.Classes006.Violao;
import Secao007_AvancandoEmPOO.Anotacoes.Classes006.Violino;
import Secao007_AvancandoEmPOO.Anotacoes.Classes007.CartaoCredito;
import Secao007_AvancandoEmPOO.Anotacoes.Classes007.Pagamento;
import Secao007_AvancandoEmPOO.Anotacoes.Classes007.TransferenciaBancaria;
import Secao007_AvancandoEmPOO.Anotacoes.Classes008.CalculadoraAvancada;
import Secao007_AvancandoEmPOO.Anotacoes.Classes09.Documento;

public class AvancandoEmPOO {

    public static void main(String[] args) {
        /*  Object composition - Classe dentro de Classe (Motor dentro de Carro)
            Exemplo 1: "Carro.java" e "Motor.java"
        */
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);
        carro1.exibirInfo();
        carro1.motor.exibirInfo();
        System.out.println("---");
        System.out.println();

        /*  Herança
            Subclasse -> Classe filha
            Superclasse -> Classe pai
            Exemplo 2: "Animal.java" e "Cachorro.java"

            A subclasse tem acesso a tudo da superclasse e a superclasse não tem acesso a classe filha
            O filho herda as coisas do pai | Mas o pai não herda as coisas do filho
            Extends -> herança
        */
        Cachorro tinowns = new Cachorro("Tinowns");
        tinowns.emitirSom();
        tinowns.latir();
        System.out.println();

        Animal alfred = new Animal("Alfred");
        alfred.emitirSom();
        // alfred.latir(); Apenas a subclasse "cachorro" pode latir
        System.out.println("---");
        System.out.println();

        /*  Classe Object
            Exemplo 3: "Pessoa.java"
        */
        Pessoa isaque = new Pessoa("Isaque", 20);
        Pessoa pedro = new Pessoa("Pedro", 20);

        System.out.println(isaque.toString());
        System.out.println(isaque.equals(pedro));
        System.out.println(isaque.hashCode());
        System.out.println("---");
        System.out.println();


        /*  Override
            Exemplo 4: "Forma.java", "Circulo.java" e "Quadrado.java"
        */
        Quadrado quadrado1 = new Quadrado(4);
        System.out.println(quadrado1.calcularArea());

        Circulo cirulo1 = new Circulo(3.2);
        System.out.println(cirulo1.calcularArea());
        System.out.println("---");
        System.out.println();


        /*  Super
            Exemplo 5: "Funcionario.java" e "Gerente.java"
        */
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();
        System.out.println(funcionario.calcularBonus());

        gerente.exibirDetalhes();
        System.out.println(gerente.calcularBonus());
        System.out.println("---");
        System.out.println();


        /*  Classes abstratas
            Exemplo 6: "InstrumentoMusical.java", "Violao.java" e "Bateria.java"
        */
        InstrumentoMusical violao = new Violao("Violão");
        InstrumentoMusical bateria = new Bateria("Bateria");

        violao.exibirDetalhes();
        violao.tocar();
        bateria.exibirDetalhes();
        bateria.tocar();
        System.out.println("---");
        System.out.println();


        /*  Interfaces
            Exemplo 7: "Pagamento.java", "CartaoCredito.java" e "TransferenciaBancaria.java"
        */
        Pagamento cartao = new CartaoCredito();
        Pagamento transferencia = new TransferenciaBancaria();

        cartao.processarPagamento(1000);
        cartao.exibirRecibo(1000);
        transferencia.processarPagamento(100);
        transferencia.exibirRecibo(100);
        System.out.println("---");
        System.out.println();


        /*  Múltiplas interfaces
            Exemplo 8: "Calculadora.java" e "CalculadoraAvancada.java"
        */
        Documento doc = new Documento("Arquivo de texto");
        doc.imprimir();
        doc.instrucaoParaSalvar();
        doc.salvar();
        System.out.println("---");
        System.out.println();


        /*  Métodos default nas interfaces
            Exemplo 9: "Documento.java"
        */
        CalculadoraAvancada calc = new CalculadoraAvancada();
        System.out.println(calc.somar(2, 4));
        System.out.println(calc.multiplicar(2, 4));
        System.out.println("---");
        System.out.println();


        /*  Polimorfismo
            Classes abstratas ou subclasses -> sobrescrever os métodos destas superclasses
            Exemplo 10: "InstrumentoMusical.java" e "Violino.java"
        */
        InstrumentoMusical violino = new Violino("Violino");
        violino.exibirDetalhes();
        violino.tocar();
    }

}
