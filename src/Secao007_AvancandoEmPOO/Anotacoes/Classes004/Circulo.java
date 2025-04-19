package Secao007_AvancandoEmPOO.Anotacoes.Classes004;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // A sobrescrita respeita retorno, nome e parâmetros(argumentos) do método
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
