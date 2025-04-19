package Secao007_AvancandoEmPOO.Anotacoes.Classes008;

interface Calculadora {

    int somar(int a, int b);

    // Ele pode ser utilizado, sem implementação
    default int multiplicar(int a, int b) {
        return a * b;
    }

}
