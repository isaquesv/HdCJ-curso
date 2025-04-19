package Secao007_AvancandoEmPOO.Anotacoes.Classes004;

public class Quadrado extends Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    // A sobrescrita respeita retorno, nome e parâmetros(argumentos) do método
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
