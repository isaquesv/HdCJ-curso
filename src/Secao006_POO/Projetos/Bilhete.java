package Secao006_POO.Projetos;

import java.util.Arrays;

public class Bilhete {

    private int[] numerosEscolhidos;
    private int[] numerosSorteados;
    private final int tamanhoBilhete = 6;

    public int[] getNumerosEscolhidos() {
        return numerosEscolhidos;
    }

    public void setNumerosEscolhidos(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }

    public void setNumerosSorteados(int[] numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }

    public int getTamanhoBilhete() {
        return tamanhoBilhete;
    }

    public void realizarSorteio() {
        numerosSorteados = new int[tamanhoBilhete];

        for (int i = 0; i < tamanhoBilhete; i++) {
            numerosSorteados[i] = (int) (Math.random() * 60) + 1;
        }

        Arrays.sort(numerosSorteados);
    }

    public int contarAcertos() {
        int acertos = 0;

        for (int i = 0; i < tamanhoBilhete; i++) {
            for (int j = 0; j < tamanhoBilhete; j++) {
                if (numerosEscolhidos[i] == numerosSorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        return acertos;
    }

    public void exibirResultado() {
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));

        int acertos = contarAcertos();
        System.out.println("Número de acertos: " + acertos);
    }
}
