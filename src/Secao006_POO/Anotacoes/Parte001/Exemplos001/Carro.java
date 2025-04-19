package Secao006_POO.Anotacoes.Parte001.Exemplos001;

public class Carro {
    // Atributos ou propriedades
    public String marca; // brand
    public String modelo;
    public int ano;
    public int velocidadeAtual = 0;
    public boolean estaLigado = false;

    // Métodos
    public void acelerar() {
        System.out.println("Estamos acelerando o carro!");
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void ligarMotor() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("Ligando o motor...");
        } else {
            System.out.println("O motor já está ligado!");
        }
    }

    public void aumentarVelocidade(double incremento) {
        if (estaLigado) {
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro é necessário ligar o motor!");
        }
    }
}
